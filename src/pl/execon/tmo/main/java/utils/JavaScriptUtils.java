package pl.execon.tmo.main.java.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavaScriptUtils {

  private static final String COMPLETE = "complete";

  private JavaScriptUtils() {

  }

  /**
   * Create one insert command in JavaScript.
   * 
   * Command finds element by given id and puts given value.
   * 
   * @param id ID of the element to put data.
   * @param value Data to put into element.
   * @return Executable js command.
   */
  public static String jsInsertById(String id, String value) {
    String insertValue = value;
    if (insertValue == null) {
      insertValue = "";
    }
    return "document.getElementById(\"" + id + "\").value=\"" + insertValue + "\";";
  }

  /**
   * Create one insert command in JavaScript.
   * 
   * Command finds element by given name and puts given value.
   * 
   * @param id ID of the element to put data.
   * @param value Data to put into element.
   * @return Executable js command.
   */
  public static String jsInsertByName(String name, String value) {
    String insertValue = value;
    if (insertValue == null) {
      insertValue = "";
    }
    return "document.getElementsByName(\"" + name + "\")[0].value=\"" + insertValue + "\";";
  }

  public static void waitUntilPageToLoad(WebDriverWait wait, WebDriver driver) {
    wait.until(getPageLoadedCondition(driver));
  }

  private static ExpectedCondition<Boolean> getPageLoadedCondition(WebDriver driver) {
    return condition -> {
      JavascriptExecutor executor = (JavascriptExecutor) driver;
      if (executor != null) {
        String result = (String) executor.executeScript("return document.readyState");
        return result != null && result.equals(COMPLETE);
      }
      return true;
    };
  }
}
