package pl.execon.tmo.main.java.utils;

import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;
import pl.execon.tmo.main.java.configuration.RunProfile;
import pl.execon.tmo.main.java.data.Configuration;
import pl.execon.tmo.main.java.data.MailInfoData;
import pl.execon.tmo.main.java.data.SupportedBrowsers;
import pl.execon.tmo.main.java.input.ConfigurationReaderInterface;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerConfiguration;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerType;
import pl.execon.tmo.main.java.testclasses.TestManager;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class to manage configuration data retrieved from xlsx file.
 *
 */
public class ConfigurationManager {
  public static final String CHROMEDRIVER_SYSTEM_PROPERTY_KEY = "webdriver.chrome.driver";
  public static final String IEDRIVER_SYSTEM_PROPERTY_KEY = "webdriver.ie.driver";
  public static final String FIREFOX_SYSTEM_PROPERTY_KEY = "webdriver.gecko.driver";
  public static final String IEDRIVER_LOG_PATH_PARAM = "webdriver.ie.driver.logfile";
  public static final String DEFAULT_IEDRIVER_LOG_PATH = "logs" + File.separator + "ielogs.log";
  private static ConfigurationManager configurationManager = null;
  private Configuration configuration;
  private ConfigurationReaderInterface configurationReader;
  private String BROWSER_KEY = "browser";
  private String SUITE_POSTFIX = "Suite";
  private String TEST_POSTFIX = "Test";

  /**
   * Method to get an instance of this object as an singleton.
   *
   * @return Instance of this class.
   */
  public synchronized static ConfigurationManager getInstance() {
    if (configurationManager == null) {
      configurationManager = new ConfigurationManager();
    }
    return configurationManager;
  }

  private ConfigurationManager() {}

  /**
   * Get number of test case from string
   *
   * @param str string to parse
   * @return test case number
   */
  private int getTsNumber(String str) {
    Pattern pattern = Pattern.compile("([0-9]+)");
    Matcher matcher = pattern.matcher(str);
    int number = 0;
    while (matcher.find()) {
      number = Integer.parseInt(matcher.group());
    }
    return number;
  }


  /**
   * Generate List of suites. We generate suite for all selected browser. Example: If we have
   * selected 3 browser method return 3 test suites for each class in mapEntry.
   *
   * @param mapEntry where key is test suite name and value of entry is test suite class object
   * @return list of suites
   */
  private List<XmlSuite> generateSuitesForClass(
      Map.Entry<String, Class<? extends TestManager>> mapEntry) {
    List<XmlSuite> browserSuites = new ArrayList<>();
    for (SupportedBrowsers supportedBrowser : configuration.getUseBrowsersList()) {
      XmlSuite suite = new XmlSuite();
      suite.setName(
          mapEntry.getKey() + "_" + supportedBrowser.name().toLowerCase() + "_" + SUITE_POSTFIX);

      Map<String, String> parameters = new HashMap<>();
      parameters.put(BROWSER_KEY, supportedBrowser.name());

      suite.setParameters(parameters);

      XmlTest test = new XmlTest(suite);
      test.setName(
          mapEntry.getKey() + "_" + supportedBrowser.name().toLowerCase() + "_" + TEST_POSTFIX);

      List<XmlClass> xmlClasses = new ArrayList<>();
      xmlClasses.add(new XmlClass(mapEntry.getValue()));
      test.setClasses(xmlClasses);

      browserSuites.add(suite);
    }
    return browserSuites;
  }

  public void setConfigurationReader(ConfigurationReaderInterface configurationReader) {
    this.configurationReader = configurationReader;
  }

  /**
   * Check if configuration is correct. Depending on selected profile we check selected fields
   *
   * @param profile selected run profile
   * @throws IOException when configuration is incorrect
   */

  public void validateConfiguration(RunProfile profile) throws IOException {
    String applicationAddress = configuration.getApplicationAddress();
    if (applicationAddress == null
        || (applicationAddress != null && applicationAddress.isEmpty())) {
      throw new IOException("Application address in not set or is not correct");
    }

    File downloadFolder = configuration.getDownloadFolder();
    if (downloadFolder == null || (downloadFolder != null && !downloadFolder.exists())) {
      throw new IOException("Download folder doesn't exists");
    }

    if (configuration.getUseBrowsersList().isEmpty()) {
      throw new IOException("Used browser is not set");
    }

    // Checking if path for browser drivers is set
    if (configuration.getUseBrowsersList().contains(SupportedBrowsers.CHROME)) {
      try {
        if (System.getProperty(CHROMEDRIVER_SYSTEM_PROPERTY_KEY) == null) {
          throw new IllegalArgumentException();
        }
      } catch (NullPointerException | IllegalArgumentException e) {
        throw new IOException("Chrome driver path is not set");
      }
    }

    if (configuration.getUseBrowsersList().contains(SupportedBrowsers.CHROME_MOBILE)) {
      try {
        if (System.getProperty(CHROMEDRIVER_SYSTEM_PROPERTY_KEY) == null) {
          throw new IllegalArgumentException();
        }
      } catch (NullPointerException | IllegalArgumentException e) {
        throw new IOException("Chrome driver path is not set");
      }
    }

    if (configuration.getUseBrowsersList().contains(SupportedBrowsers.FIREFOX)) {
      try {
        if (System.getProperty(FIREFOX_SYSTEM_PROPERTY_KEY) == null) {
          throw new IllegalArgumentException();
        }
      } catch (NullPointerException | IllegalArgumentException e) {
        throw new IOException("Firefox driver path is not set");
      }
    }

    if (configuration.getTcSources().isEmpty()) {
      throw new IOException("No test suites to run");
    }

    // Checking database configuration
    DatabaseInfoData databaseInfoData = configuration.getDatabaseInfoData();

    String host = databaseInfoData.getHost();
    boolean isUsePort = databaseInfoData.isUsePort();
    Integer port = databaseInfoData.getPort();
    String user = databaseInfoData.getLogin();
    String password = databaseInfoData.getPassword();
    String dbName = databaseInfoData.getDbName();

    if(host == null || host.isEmpty()) {
        throw new IOException("Database host cannot be null");
    } else if (isUsePort) {
      if(port <= 0) {
          throw new IOException("Host port is not correctly set");
      }
    } else if(user == null || user.isEmpty()) {
        throw new IOException("Username cannot be empty");
    } else if(password == null || password.isEmpty()) {
        throw new IOException("Password cannot be empty");
    } else if(dbName == null || dbName.isEmpty()) {
        throw new IOException("Db name cannot be empty");
    }

    if (profile == RunProfile.PRODUCTION) {
      // Checking Issue tracker configuration
      IssueTrackerConfiguration trackerConfiguration = configuration.getIssueTrackerConfiguration();
      IssueTrackerType trackerType = trackerConfiguration.getTrackerType();

      if (trackerType != null && trackerType != IssueTrackerType.NONE) {
        String projectName = trackerConfiguration.getProjectName();
        String issueTrackerAddress = trackerConfiguration.getAddress();
        String issueTrackerLogin = trackerConfiguration.getLogin();
        String issueTrackerPassword = trackerConfiguration.getPassword();

        if (projectName == null || (projectName != null && projectName.isEmpty())) {
          throw new IOException("Issue tracker project name is not set");
        } else if (issueTrackerAddress == null
            || (issueTrackerAddress != null && issueTrackerAddress.isEmpty())) {
          throw new IOException("Issue tracker address is not set");
        } else if (issueTrackerLogin == null
            || (issueTrackerLogin != null && issueTrackerLogin.isEmpty())) {
          throw new IOException("Issue tracker login in not set");
        } else if (issueTrackerPassword == null
            || (issueTrackerPassword != null && issueTrackerPassword.isEmpty())) {
          throw new IOException("Issue tracker password is not set");
        }
      }

      // Checking mail configuration
      MailInfoData mailInfoData = configuration.getMailInfoData();
      String mailPass = mailInfoData.getPassword();
      String mailFrom = mailInfoData.getFrom();
      List<String> mailTo = mailInfoData.getTo();
      String mailHost = mailInfoData.getHost();
      int mailPort = mailInfoData.getPort();
      String mailTopic = mailInfoData.getTopic();

      boolean isAuthEnabled = mailInfoData.isUseAuthentication();
      String authLogin = mailInfoData.getAuthLogin();

      if(isAuthEnabled) {
        if(authLogin == null || (authLogin != null && authLogin.isEmpty())) {
          throw new IOException("Auth login cannot be null");
        }
      }

      if (mailPass == null) {
        throw new IOException("Mail password cannot be null");
      } else if (mailFrom == null || (mailFrom != null && mailFrom.isEmpty())) {
        throw new IOException("Mail sender is not set");
      } else if (mailTo == null || (mailTo != null && mailTo.isEmpty())) {
        throw new IOException("Mail receiver(s) is not set");
      } else if (mailHost == null || (mailHost != null && mailHost.isEmpty())) {
        throw new IOException("Mail host is not set");
      } else if (mailPort <= 0) {
        throw new IOException("Mail port is not correctly set");
      } else if (mailTopic == null) {
        throw new IOException("Mail topic cannot be null");
      }
    }
  }

  /**
   * Create configuration using injected configuration reader interface, create report dir and set
   * browser drivers path
   *
   * @throws IOException when drivers path is incorrect or can't create report dir
   */
  public void createConfiguration() throws IOException {

    Configuration readConfiguration = configurationReader.readConfiguration();
    File reportDir = new File(readConfiguration.getReportOutputDirectory());
    if (!reportDir.exists() && !reportDir.mkdirs()) {
      throw new IOException("Can't create file " + reportDir.getPath());
    }


    if (readConfiguration.getChromeDriverPath() != null
            && !readConfiguration.getChromeDriverPath().isEmpty()) {

      File chromeDriver = new File(readConfiguration.getChromeDriverPath());
      if (chromeDriver.exists()) {
        System.setProperty(CHROMEDRIVER_SYSTEM_PROPERTY_KEY, chromeDriver.getAbsolutePath());
      } else {
        throw new IOException("Chrome driver does not exist");
      }
    }


    if (readConfiguration.getIeDriverPath() != null && !readConfiguration.getIeDriverPath().isEmpty()) {

      File ieDriver = new File(readConfiguration.getIeDriverPath());
      if (ieDriver.exists()) {
        System.setProperty(ConfigurationManager.IEDRIVER_SYSTEM_PROPERTY_KEY,
                ieDriver.getAbsolutePath());
        System.setProperty(IEDRIVER_LOG_PATH_PARAM, DEFAULT_IEDRIVER_LOG_PATH);
      } else {
        throw new IOException("IE driver does not exist");
      }
    }


    if (readConfiguration.getFirefoxDriverPath() != null && !readConfiguration.getFirefoxDriverPath().isEmpty()) {

      File ffDriver = new File(readConfiguration.getFirefoxDriverPath());
      if (ffDriver.exists()) {
          System.setProperty(ConfigurationManager.FIREFOX_SYSTEM_PROPERTY_KEY, ffDriver.getAbsolutePath());
      } else {
          throw new IOException("Firefox driver does not exist");
      }
    }

      this.configuration = readConfiguration;
  }

  /**
   * Generate and sort test suites used by TestNG
   *
   * @param allTestClassMap list of test classes which will be used to create test suites
   * @return list of created test suites
   * @see Configuration
   */

  public List<XmlSuite> getAllXmlSuites(Map<String, Class<? extends TestManager>> allTestClassMap) {
    List<XmlSuite> suites = new ArrayList<>();
    for (Map.Entry<String, Class<? extends TestManager>> mapEntry : allTestClassMap.entrySet()) {
      if (configuration.getTcSources().containsKey(mapEntry.getKey())) {
        suites.addAll(generateSuitesForClass(mapEntry));
      }
    }

    // Sortujemy suity tak aby testy rozpoczynaly sie od Suite'a o najnizszym numerze
    Collections.sort(suites, (o1, o2) -> {
      int ts1Number = getTsNumber(o1.getName());
      int ts2Number = getTsNumber(o2.getName());
      if (ts1Number > ts2Number) {
        return 1;
      } else if (ts2Number == ts1Number) {
        return 0;
      } else {
        return -1;
      }
    });

    return suites;
  }

  /**
   * Get configuration object
   *
   * @return configuration object
   * @see Configuration
   */

  public Configuration getConfiguration() {
    return configuration;
  }

}
