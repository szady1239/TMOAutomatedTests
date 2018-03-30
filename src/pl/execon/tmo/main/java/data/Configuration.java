package pl.execon.tmo.main.java.data;

import pl.execon.tmo.main.java.issuetracker.IssueTrackerConfiguration;
import pl.execon.tmo.main.java.testclasses.TestManager;
import pl.execon.tmo.main.java.utils.Log;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class that contains information about all tests configuration.
 *
 * @author Mateusz Grajper date: 26 kwi 2016
 */
public class Configuration {

    private String loggingDepth;
    private String logPath;
    private ScreenshotWriter screenshotWriter;
    private String screenshotDirectoryPath;
    private String applicationAddress;
    private String reportOutputDirectory;
    private Map<String, String> tcSources;
    private MailInfoData mailInfoData;
    private IssueTrackerConfiguration issueTrackerConfiguration;
    private List<SupportedBrowsers> useBrowsersList;
    private String chromeDriverPath;
    private String ieDriverPath;
    private String firefoxDriverPath;
    private File downloadFolder;
    private String mobileHeight;
    private String mobileWidth;


    private ScreenshotWriter defaultScreenShotWriter = ScreenshotWriter.NONE;

    public Configuration() {
        tcSources = new HashMap<>();
        issueTrackerConfiguration = new IssueTrackerConfiguration();
        mailInfoData = new MailInfoData();
        screenshotWriter = defaultScreenShotWriter;
        useBrowsersList = new ArrayList<>();
    }


    public String getMobileHeight() {
        return mobileHeight;
    }

    public void setMobileHeight(String mobileHeight) {
        this.mobileHeight = mobileHeight;
    }

    public String getMobileWidth() {
        return mobileWidth;
    }

    public void setMobileWidth(String mobileWidth) {
        this.mobileWidth = mobileWidth;
    }

    public String getLoggingDepth() {
        return loggingDepth;
    }

    public void setLoggingDepth(String loggingDepth) {
        this.loggingDepth = loggingDepth;
    }

    public String getLogPath() {
        return logPath;
    }

    public void setLogPath(String logPath) {
        this.logPath = logPath;
    }

    public ScreenshotWriter getScreenshotWriter() {
        return screenshotWriter;
    }

    public void parseScreenshotWriter(String screenshotWriterAsString) {
        try {
            this.screenshotWriter = ScreenshotWriter.valueOf(screenshotWriterAsString);
        } catch (IllegalArgumentException e) {
            Log.info("Unknown value of screenshot writer. Set default " + defaultScreenShotWriter);
            this.screenshotWriter = defaultScreenShotWriter;
        }
    }

    public String getScreenshotDirectoryPath() {
        return screenshotDirectoryPath;
    }

    public void setScreenshotDirectoryPath(String screenshotDirectoryPath) {
        this.screenshotDirectoryPath = screenshotDirectoryPath;
    }

    public String getApplicationAddress() {
        return applicationAddress;
    }

    public void setApplicationAddress(String applicationAddress) {
        this.applicationAddress = applicationAddress;
    }

    public String getReportOutputDirectory() {
        return reportOutputDirectory;
    }

    public void setReportOutputDirectory(String reportOutputDirectory) {
        this.reportOutputDirectory = reportOutputDirectory;
    }


    public MailInfoData getMailInfoData() {
        return mailInfoData;
    }

    public Map<String, String> getTcSources() {
        return tcSources;
    }

    public void putTcSource(String tcName, String tcConfFilePath) {
        tcSources.put(tcName, tcConfFilePath);
    }

    public IssueTrackerConfiguration getIssueTrackerConfiguration() {
        return issueTrackerConfiguration;
    }

    public void addBrowser(SupportedBrowsers supportedBrowser) {
        this.useBrowsersList.add(supportedBrowser);
    }

    public List<SupportedBrowsers> getUseBrowsersList() {
        return useBrowsersList;
    }

    /**
     * Method gets relative path to report file, concatenating its directory and name
     *
     * @return file path in String
     */
    public String getReportDirectory() {

        String reportDir = this.getReportOutputDirectory();

        if (reportDir == null || reportDir.isEmpty()) {
            reportDir = TestManager.DEFAULT_REPORT_DIRECTORY;
        }

        return reportDir;

    }

    public String getChromeDriverPath() {
        return chromeDriverPath;
    }

    public void setChromeDriverPath(String chromeDriverPath) {
        this.chromeDriverPath = chromeDriverPath;
    }

    public String getIeDriverPath() {
        return ieDriverPath;
    }

    public void setIeDriverPath(String ieDriverPath) {
        this.ieDriverPath = ieDriverPath;
    }

    public String getFirefoxDriverPath() {
        return firefoxDriverPath;
    }

    public void setFirefoxDriverPath(String firefoxDriverPath) {
        this.firefoxDriverPath = firefoxDriverPath;
    }

    public File getDownloadFolder() {
        return downloadFolder;
    }

    public void setDownloadFolder(File downloadFolder) {
        this.downloadFolder = downloadFolder;
    }
}
