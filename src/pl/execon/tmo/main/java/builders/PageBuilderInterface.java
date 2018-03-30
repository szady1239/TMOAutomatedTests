package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;

/**
 * Interface every PageBuilder has to implement
 * 
 * @author Oskar Kleska date: 27 kwi 2016
 */
public interface PageBuilderInterface {
  /**
   * Method building Page object
   * 
   * @param driver
   */
  public void buildPage(WebDriver driver);

  /**
   * Get method for page object
   * 
   * @return Page object
   */
  public PageInterface getPage();
}
