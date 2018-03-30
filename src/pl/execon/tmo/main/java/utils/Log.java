package pl.execon.tmo.main.java.utils;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import pl.execon.tmo.main.java.data.Configuration;
import pl.execon.tmo.main.java.testclasses.BasicAppConfiguration;

import java.io.IOException;
import java.util.Properties;

/**
 * Logger class
 * 
 * @author Arkadiusz Pszczola
 *
 */
public class Log {

  private static Logger LOGGER;
  private static BasicAppConfiguration basicAppConfiguration = new BasicAppConfiguration();
  private static String LOG_PATH_KEY = "log4j.appender.file.File";

  private Log() {
  }

  /**
   * Initialization of logger.
   * 
   * @param level Level of logging.
   */
  public static void initLogger(String level) throws IOException {
    Configuration configuration = ConfigurationManager.getInstance().getConfiguration();
    Properties logProperties = new Properties();
    logProperties.load(basicAppConfiguration.getLogConfigurationFileAsStream());

    if(configuration.getLogPath() != null) {
      logProperties.setProperty(LOG_PATH_KEY, configuration.getLogPath());
    }

    PropertyConfigurator.configure(logProperties);
    LOGGER = Logger.getLogger(Log.class.getName());
    if (Level.DEBUG.toString().equalsIgnoreCase(level)) {
      LOGGER.setLevel(Level.DEBUG);
    } else if (Level.WARN.toString().equalsIgnoreCase(level)) {
      LOGGER.setLevel(Level.WARN);
    } else if (Level.ERROR.toString().equalsIgnoreCase(level)) {
      LOGGER.setLevel(Level.ERROR);
    } else {
      LOGGER.setLevel(Level.DEBUG);
    }

  }

  /**
   * Logs beginning of test case.
   * 
   * @param sTestCaseName Test case name.
   */
  public static void startTestCase(String sTestCaseName) {

    LOGGER.info("### " + sTestCaseName + " ###");

  }



  /**
   * Logs end of test case.
   */
  public static void endTestCase() {

    LOGGER.info("### " + "-END-" + " ###");

  }


  /**
   * Logs information at 'info' level.
   * 
   * @param message Information to log.
   */
  public static void info(String message) {

    LOGGER.info(message);

  }

  /**
   * Logs information at 'info' level.
   * 
   * @param message
   * @param e
   */
  public static void info(String message, Throwable e) {

    LOGGER.info(message, e);

  }

  /**
   * Logs information at 'debug' level.
   * 
   * @param message Information to log.
   */

  public static void debug(String message) {

    LOGGER.debug(message);

  }

  /**
   * Logs information at 'warn' level.
   * 
   * @param message Information to log.
   */

  public static void warn(String message) {

    LOGGER.warn(message);

  }

  /**
   * Logs information at 'warn' level.
   * 
   * @param message
   * @param e
   */
  public static void warn(String message, Throwable e) {

    LOGGER.warn(message, e);

  }

  /**
   * Logs information at 'error' level.
   * 
   * @param message Information to log.
   */
  public static void error(String message) {

    LOGGER.error(message);

  }

  /**
   * Logs information with throwable stack trace at 'error' level.
   * 
   * @param message
   * @param e
   */
  public static void error(String message, Throwable e) {

    LOGGER.error(message, e);

  }

}
