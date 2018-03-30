package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;

/**
 * Builder director responsible for builders management
 * 
 * @author Oskar Kleska date: 27 kwi 2016
 */

public class PageDirector {

  /**
   * SystemPage build director
   */
  private PageBuilderInterface pageBuilder;

  /**
   * Method responsible for build page
   * 
   * @param driver Web driver with browser instance.
   */
  public void makePage(WebDriver driver) {
    this.pageBuilder.buildPage(driver);
  }

  public PageInterface getPage() {
    return this.pageBuilder.getPage();
  }

  public PageBuilderInterface getPageBuilder() {
    return pageBuilder;
  }

  public void setPageBuilder(PageBuilderInterface pageBuilder) {
    this.pageBuilder = pageBuilder;
  }

}
