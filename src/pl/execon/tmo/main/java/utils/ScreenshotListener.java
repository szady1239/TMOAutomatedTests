package pl.execon.tmo.main.java.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.data.ScreenshotWriter;
import pl.execon.tmo.main.java.data.SupportedBrowsers;

import java.io.*;
import java.util.Date;

/**
 * Class used to make and save screenshots
 *
 * @author Arkadiusz Pszczola
 * @author Pawel Lagodzinski
 * @version 1.0
 * @since 2016-07-01
 */
public class ScreenshotListener {

  private WebDriver driver;
  private String screenshotDirectory;
  private String reportDirectory;
  private ScreenshotWriter screenshotWriter;
  private File scrFile;
  private static final String DEFAULT_SCREENSHOT_FILE_NAME = "screenshot.png";
  private static final String DEFAULT_SCRENSHOOT_DIRECTORY = "screenshots";
  private static final String DEFAULT_HTML_OUTPUT_FILE_NAME = "HTMLOutput.html";
  private String tcName = "";
  private int counter = 0;
  private String htmlOutput = "";
  private SupportedBrowsers browser;
  private static ScreenshotListener listener;

  /**
   * Class constructor.
   *
   * @param driver Web driver with browser instance.
   * @param screenshotDirectory Path to folder in which screenshots shall be stored.
   * @param screenshotWriter Information when screenshots shall be take.
   */
  private ScreenshotListener(WebDriver driver, String screenshotDirectory,
                             ScreenshotWriter screenshotWriter, SupportedBrowsers browser, String reportDirectory) {
    this.driver = driver;
    this.screenshotDirectory = screenshotDirectory;
    this.screenshotWriter = screenshotWriter;
    this.browser = browser;
    this.reportDirectory = reportDirectory;
  }

  public synchronized static void createScreenshotListener(WebDriver driver, String screenshotDirectory,
                                                           ScreenshotWriter screenshotWriter, SupportedBrowsers browser, String reportDirectory) {
      listener = new ScreenshotListener(driver, screenshotDirectory, screenshotWriter, browser, reportDirectory);
  }

  public synchronized static ScreenshotListener getListener() {
    return listener;
  }



  /**
   * Create and save screenshot
   * 
   * @param isError Whether current screen is an error screen
   */
  public void takeAndSaveScreenshot(boolean isError) {
    takeScreenshot(isError);
    saveScreenshot(isError);
  }

  /**
   * Method to get a screenshot.
   *
   * @param isError Whether current screen is an error screen.
   */
  public void takeScreenshot(boolean isError) {
    if (screenshotWriter == ScreenshotWriter.ALL || (screenshotWriter == ScreenshotWriter.TEST_FAIL && isError)) {
      scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
      htmlOutput = driver.getPageSource();
    }
  }

  /**
   * Method to save screenshot on disk.
   *
   * @param isError Whether current screen is an error screen.
   */


  public void saveScreenshot(boolean isError) {
    Date screenshotDate = new Date();
    File finalScrenshotFile = null;
    if (screenshotWriter == ScreenshotWriter.ALL
        || (screenshotWriter == ScreenshotWriter.TEST_FAIL && isError)) {
      String basicDirPath = screenshotDirectory != null ? screenshotDirectory
          : ScreenshotListener.DEFAULT_SCRENSHOOT_DIRECTORY;
      File htmlOutputFile = new File(basicDirPath + File.separator + tcName + "_" + counter + "_"
          + screenshotDate.getTime() + "_" + ScreenshotListener.DEFAULT_HTML_OUTPUT_FILE_NAME);
//      if (browser != SupportedBrowsers.HEADLESS) {
        try {
          finalScrenshotFile = new File(basicDirPath + File.separator + tcName + "_" + counter + "_"
              + screenshotDate.getTime() + "_" + ScreenshotListener.DEFAULT_SCREENSHOT_FILE_NAME);
          FileUtils.copyFile(scrFile, finalScrenshotFile);
        } catch (IOException e) {
          Log.info("Error when copy file " + e.getMessage());
        }
//      }
      try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream(htmlOutputFile.getAbsoluteFile()), "UTF8"));) {
        bw.write(htmlOutput);
      } catch (IOException e) {
        Log.error(
            "Error when save file " + htmlOutputFile.getName() + " Reason: " + e.getMessage());
      }
      if (isError) {
        saveForReport(htmlOutputFile, finalScrenshotFile);
      }
    }
    counter++;
  }

  /**
   * Copy screenshots to report folder
   * 
   * @param htmlOutputFile report file
   * @param finalScrenshotFile final screenshot file
   */
  private void saveForReport(File htmlOutputFile, File finalScrenshotFile) {
    try {
      // scrFile will be null when driver is for headless browser.
      if (finalScrenshotFile != null) {
        FileUtils.copyFile(finalScrenshotFile, new File(reportDirectory + File.separator + tcName
            + "_" + browser.toString().toLowerCase() + "_Test.png"));
      }
      FileUtils.copyFile(htmlOutputFile, new File(reportDirectory + File.separator + tcName + "_"
          + browser.toString().toLowerCase() + "_Test.html"));
    } catch (IOException e) {
      Log.info("Error while creating screenshot copies for reports", e);
    }

  }

  /**
   * Resets counter of screenshots to 0.
   */
  public void resetCounter() {
    this.counter = 0;
  }

  /**
   * Sets name of currently executed test case.
   *
   * @param tcName Name of currently executed test case.
   */
  public void setTcName(String tcName) {
    this.tcName = tcName;
  }

}
