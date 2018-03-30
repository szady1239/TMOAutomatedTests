package pl.execon.tmo.main.java.utils;

import org.openqa.selenium.TimeoutException;
import pl.execon.tmo.main.java.builders.PageBuilderInterface;
import pl.execon.tmo.main.java.builders.PageDirector;
import pl.execon.tmo.main.java.testclasses.TestManager;

/**
 * Class used to build page
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-18
 */
public class PageBuilderHelper {

  private static final PageDirector pageDirector = new PageDirector();

  private PageBuilderHelper() { }

  /**
   * Method used to generate page
   *
   * @param testManager actual test class
   * @param pageBuilderInterface used to build class
   * @param makeScreenshots make screenshot after create class
   * @param isError Whether current screen is an error screen.
   * @param <T> type of generated page class
   * @return generated page object
   */

  public static <T> T generatePage(TestManager testManager,
                                   PageBuilderInterface pageBuilderInterface, boolean makeScreenshots, boolean isError) {
    try {
      JavaScriptUtils.waitUntilPageToLoad(testManager.getWait(), testManager.getWebDriver());
    } catch (TimeoutException e) {
      Log.warn("Timeout error can happen at Headless.", e);
    }
    pageDirector.setPageBuilder(pageBuilderInterface);
    pageDirector.makePage(testManager.getWebDriver());
    if (makeScreenshots) {
      testManager.getScreenshotListener().takeScreenshot(isError);
      testManager.getScreenshotListener().saveScreenshot(isError);
    }
    return (T) pageDirector.getPage();
  }

  /**
   * Method used to reload page and make screenshot after generate
   *
   * @param testManager actual test class
   * @param isError Whether current screen is an error screen.
   * @param <T> type of generated page class
   * @return reloaded page object
   */

  public static <T> T reloadPage(TestManager testManager, boolean isError) {
    JavaScriptUtils.waitUntilPageToLoad(testManager.getWait(), testManager.getWebDriver());
    pageDirector.makePage(testManager.getWebDriver());
    testManager.getScreenshotListener().takeScreenshot(isError);
    testManager.getScreenshotListener().saveScreenshot(isError);
    return (T) pageDirector.getPage();
  }

}
