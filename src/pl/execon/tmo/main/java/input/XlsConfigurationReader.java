package pl.execon.tmo.main.java.input;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddress;
import pl.execon.tmo.main.java.data.Configuration;
import pl.execon.tmo.main.java.data.MailInfoData;
import pl.execon.tmo.main.java.data.SupportedBrowsers;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerConfiguration;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerType;
import pl.execon.tmo.main.java.utils.GenericDataHelper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Class is used to read configuration from xlsx file
 *
 * @author Pawel Lagodzinski
 * @author Mateusz Grajper
 * @version 1.0
 * @since 2016-07-15
 */

public class XlsConfigurationReader implements ConfigurationReaderInterface {

    private static final IssueTrackerType DEFAULT_ISSUE_TRACKER_TYPE = IssueTrackerType.NONE;
    private static final int DEFAULT_MAIL_PORT = 465;
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
    private String configurationFile;
    private String sheetName;
    private String LOGGING_DEPTH_PARAM_NAME = "logging depth";
    private String LOG_PATH_PARAM_NAME = "log path";
    private String SCREENSHOT_WRITER_PARAM_NAME = "screenshot writer";
    private String SCREENSHOT_DIRECTORY_PATH_PARAM_NAME = "screenshot directory path";
    private String DOWNLOAD_FOLDER_PARAM_NAME = "download folder";
    private String FIREFOX_PARAM_NAME = "firefox";
    private String CHROME_PARAM_NAME = "chrome";
    private String CHROME_MOBILE_PARAM_NAME = "chrome mobile";
    private String MOBILE_WIDTH = "mobile width";
    private String MOBILE_HEIGHT = "mobile height";
    private String CHROME_DRIVER_PATH_NAME = "chrome driver path";
    private String FIREFOX_DRIVER_PATH_NAME = "firefox driver path";
    private String APPLICATION_ADDRES_PARAM_NAME = "adres aplikacji";
    private String REPORT_OUTPUT_PARAM_NAME = "report output directory";
    private String ISSUE_REPORTER_ADDRESS = "issue reporter address";
    private String ISSUE_REPORTER_LOGIN = "issue reporter login";
    private String ISSUE_REPORTER_PASSWORD = "issue reporter password";
    private String ISSUE_REPORTER_PROJECT = "issue reporter project";
    private String ISSUE_REPORTER_COMPONENTS = "issue reporter components";
    private String ISSUE_REPORTER_TYPE = "issue reporter type";

    /**
     * Constructor
     *
     * @param configurationFile absolute path to xlsx file witch contains configuration data
     * @param sheetName         sheet name which contains configuration data
     */

    public XlsConfigurationReader(String configurationFile, String sheetName) {
        this.configurationFile = configurationFile;
        this.sheetName = sheetName;
    }

    /**
     * Create folder when we write reports with results
     *
     * @param basicFolderPath absolute file to parent location
     * @return absolute path to reports folder
     */

    private String createFinalReportFolder(String basicFolderPath) {
        if (!basicFolderPath.endsWith(File.separator)) {
            basicFolderPath = basicFolderPath + File.separator;
        }
        File file = new File(basicFolderPath + dateFormat.format(new Date()));
        return file.getPath();
    }

    /**
     * Parse issue tracker components. Is used by issue tracker like Jira to create tasks
     *
     * @param components information about components readed from xlsx file
     * @return list with component names
     * @see IssueTrackerConfiguration
     */

    private List<String> parseComponents(String components) {
        List<String> result = new ArrayList<>();
        String componentsWithoutWhitespace = components.replaceAll("\\s+", "");
        for (String component : componentsWithoutWhitespace.split(",")) {
            if (!component.isEmpty()) {
                result.add(component);
            }
        }
        return result;
    }

    /**
     * Set data specified for issue tracker
     *
     * @param entry                     where key is name of parameter and value is value of parameter readed from xlsx file
     * @param issueTrackerConfiguration object to update
     * @return true if found any matching key, false if not
     * @see IssueTrackerConfiguration
     */

    private boolean setIssueTrackerFields(Map.Entry<String, String> entry, IssueTrackerConfiguration issueTrackerConfiguration) {
        Boolean returnValue = Boolean.FALSE;
        if (entry.getKey().equalsIgnoreCase(ISSUE_REPORTER_ADDRESS)) {
            issueTrackerConfiguration.setAddress(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(ISSUE_REPORTER_COMPONENTS)) {
            List<String> componentsList = parseComponents(entry.getValue());
            issueTrackerConfiguration.setComponentNames(componentsList);
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(ISSUE_REPORTER_LOGIN)) {
            issueTrackerConfiguration.setLogin(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(ISSUE_REPORTER_PASSWORD)) {
            issueTrackerConfiguration.setPassword(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(ISSUE_REPORTER_PROJECT)) {
            issueTrackerConfiguration.setProjectName(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(ISSUE_REPORTER_TYPE)) {
            try {
                issueTrackerConfiguration.setTrackerType(IssueTrackerType.valueOf(entry.getValue()));
                returnValue = Boolean.TRUE;
            } catch (IllegalArgumentException e) {
                issueTrackerConfiguration.setTrackerType(DEFAULT_ISSUE_TRACKER_TYPE);
                returnValue = Boolean.TRUE;
            }
        }
        return returnValue;
    }

    /**
     * Set main fields of configuration
     *
     * @param entry         where key is name of parameter and value is value of parameter readed from xlsx file
     * @param configuration contains information about configuration data
     * @return true if found any matching key, false if not
     */

    private boolean setMainFields(Map.Entry<String, String> entry, Configuration configuration) {
        boolean returnValue = Boolean.FALSE;
        if (entry.getKey().equalsIgnoreCase(APPLICATION_ADDRES_PARAM_NAME)) {
            configuration.setApplicationAddress(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(LOG_PATH_PARAM_NAME)) {
            configuration.setLogPath(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MOBILE_HEIGHT)) {
            configuration.setMobileHeight(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MOBILE_WIDTH)) {
            configuration.setMobileWidth(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(LOGGING_DEPTH_PARAM_NAME)) {
            configuration.setLoggingDepth(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey()
                .equalsIgnoreCase(SCREENSHOT_DIRECTORY_PATH_PARAM_NAME)) {
            configuration.setScreenshotDirectoryPath(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(SCREENSHOT_WRITER_PARAM_NAME)) {
            configuration.parseScreenshotWriter(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(REPORT_OUTPUT_PARAM_NAME)) {
            configuration.setReportOutputDirectory(createFinalReportFolder(entry.getValue()));
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(FIREFOX_PARAM_NAME)) {
            if (GenericDataHelper.parseBool(entry.getValue())) {
                configuration.addBrowser(SupportedBrowsers.FIREFOX);
            }
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(CHROME_PARAM_NAME)) {
            if (GenericDataHelper.parseBool(entry.getValue())) {
                configuration.addBrowser(SupportedBrowsers.CHROME);
            }
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(CHROME_MOBILE_PARAM_NAME)) {
            if (GenericDataHelper.parseBool(entry.getValue())) {
                configuration.addBrowser(SupportedBrowsers.CHROME_MOBILE);
            }
        } else if (entry.getKey().equalsIgnoreCase(CHROME_DRIVER_PATH_NAME)) {
            configuration.setChromeDriverPath(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(FIREFOX_DRIVER_PATH_NAME)) {
            configuration.setFirefoxDriverPath(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(DOWNLOAD_FOLDER_PARAM_NAME)) {
            File downloadFolder = new File(entry.getValue());
            File file = new File(downloadFolder.getPath() + File.separator + dateFormat.format(new Date()));
            if (!file.exists() && !file.mkdirs()) {
                throw new RuntimeException("Can't create download folder");
            }
            configuration.setDownloadFolder(file);
            returnValue = Boolean.TRUE;
        }

        return returnValue;
    }

    /**
     * Set data specified for sending mail
     *
     * @param entry        where key is name of parameter and value is value of parameter readed from xlsx file
     * @param mailInfoData contains information needed to send mail
     * @return true if found any matching key
     */

    private boolean setMailInfoData(Map.Entry<String, String> entry, MailInfoData mailInfoData) {
        boolean returnValue = Boolean.FALSE;
        if (entry.getKey().equalsIgnoreCase(MailInfoData.HOST)) {
            mailInfoData.setHost(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.SENDER)) {
            mailInfoData.setFrom(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.RECEIVER)) {
            mailInfoData.addTo(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.PASSWORD)) {
            mailInfoData.setPassword(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.PORT)) {
            try {
                mailInfoData.setPort(Integer.parseInt(entry.getValue()));
            } catch (NumberFormatException e) {
                mailInfoData.setPort(DEFAULT_MAIL_PORT);
            }
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.TOPIC)) {
            mailInfoData.setTopic(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.USE_AUTHENTICATION)) {
            mailInfoData.setUseAuthentication(GenericDataHelper.parseBool(entry.getValue()));
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.USE_SSL)) {
            mailInfoData.setUseSsl(GenericDataHelper.parseBool(entry.getValue()));
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.AUTH_LOGIN)) {
            mailInfoData.setAuthLogin(entry.getValue());
            returnValue = Boolean.TRUE;
        } else if (entry.getKey().equalsIgnoreCase(MailInfoData.AUTH_PASSWORD)) {
            mailInfoData.setAuthPassword(entry.getValue());
            returnValue = Boolean.TRUE;
        }
        return returnValue;
    }

    /**
     * Method read only first and second column. First column contains
     * <p>
     * keys for map, second contains values for map
     *
     * @param sheet object containing configuration data
     * @return map contains data used to build configuration object
     */

    private Map<String, String> getConfigurationParams(Sheet sheet) {
        List<CellRangeAddress> mergedRegionsList = XlsHelper.getMergedRegions(sheet);
        Map<String, String> map = new HashMap<>();
        Iterator<Row> rowIterator = sheet.rowIterator();
        while (rowIterator.hasNext()) {
            Row row = rowIterator.next();
            Cell paramCell = row.getCell(0);
            Cell valueCell = row.getCell(1);
            boolean condition = row.getRowNum() == 0 && XlsHelper.checkHeader(paramCell);
            boolean condition2 = paramCell == null || (paramCell != null && XlsHelper.isCellInMergedRegion(mergedRegionsList, paramCell));
            if (condition || condition2) {
                continue;
            }
            if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_STRING) {
                map.put(GenericDataHelper.removeWhiteSpace(paramCell.getStringCellValue()), GenericDataHelper.removeWhiteSpace(valueCell.getStringCellValue()));
            } else if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_BLANK) {
                map.put(GenericDataHelper.removeWhiteSpace(paramCell.getStringCellValue()), "");
            } else if (valueCell != null && valueCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                Double doubleVal = valueCell.getNumericCellValue();
                map.put(GenericDataHelper.removeWhiteSpace(paramCell.getStringCellValue()), Integer.toString(doubleVal.intValue()));
            } else {
                map.put(GenericDataHelper.removeWhiteSpace(paramCell.getStringCellValue()), "");
            }
        }
        return map;
    }


    /**
     * Generate configuration object based on data readed from xlsx file
     *
     * @return configuration object
     * @throws IOException when can't read data needed to create configuration object
     */

    @Override
    public Configuration readConfiguration() throws IOException {
        Configuration configuration = new Configuration();

        File file = new File(configurationFile);
        if (!file.exists()) {
            throw new IOException("File " + configurationFile + " not exists");
        }
        Sheet sheet = XlsHelper.readSheet(file, sheetName);
        if (sheet != null) {
            Map<String, String> configurationMap = getConfigurationParams(sheet);

            for (Map.Entry<String, String> entry : configurationMap.entrySet()) {
                boolean isMainFieldSet = setMainFields(entry, configuration);
                boolean isIssueTrackerFieldSet =
                        setIssueTrackerFields(entry, configuration.getIssueTrackerConfiguration());
                boolean isMailFiledSet = setMailInfoData(entry, configuration.getMailInfoData());

                if (!isMainFieldSet && !isIssueTrackerFieldSet && !isMailFiledSet && entry.getValue() != null) {
                    if (!entry.getValue().isEmpty()) {
                        configuration.putTcSource(entry.getKey(), entry.getValue());
                    }
                }
            }

        }
        return configuration;
    }
}
