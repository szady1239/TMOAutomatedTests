package pl.execon.tmo.main.java.testclasses;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pl.execon.tmo.main.java.utils.Log;

import java.util.concurrent.TimeUnit;

public class WebUtils {

    private static final String DISABLED_BTN_PROPERTY = "src";
    private static final String DISABLED_BTN_SHOULD_CONTAIN = "disabled";
    private static final int TEN = 10;
    private static final int ONE = 1;

    private WebUtils() {

    }

    /**
     * Check if element exists on page
     *
     * @param driver used to manage browser
     * @param by     ??
     * @return true if element exists, false if not
     */

    public static boolean isElementPresented(WebDriver driver, By by) {
        driver.manage().timeouts().implicitlyWait(ONE, TimeUnit.SECONDS);
        try {
            driver.findElement(by);
            driver.manage().timeouts().implicitlyWait(TEN, TimeUnit.SECONDS);
            return Boolean.TRUE;
        } catch (NoSuchElementException e) {
            Log.info("Nie znaleziono elementu", e);
            driver.manage().timeouts().implicitlyWait(TEN, TimeUnit.SECONDS);
            return Boolean.FALSE;
        }
    }

    public static WebElement getElementByXPath(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    /**
     * Check if button is disabled
     *
     * @param btn element to check
     * @return true is button is disabled, false if not
     */

    public static boolean isBtnDisabled(WebElement btn) {
        String disabledVal = btn.getAttribute(DISABLED_BTN_SHOULD_CONTAIN);
        return disabledVal != null && disabledVal.equals(Boolean.TRUE.toString());
    }

    /**
     * Check if image button is enabled
     *
     * @param btn element to check
     * @return true if button is enabled, false if not
     */

    public static boolean isImgBtnEnabled(WebElement btn) {
        String propertyValue = btn.getAttribute(DISABLED_BTN_PROPERTY);
        return !StringUtils.containsIgnoreCase(propertyValue.toLowerCase(),
                DISABLED_BTN_SHOULD_CONTAIN);
    }

    /**
     * Get element by xpath
     *
     * @param driver driver to manage browser
     * @param xpath  unique path to element
     * @return WebElement
     * @throws NoSuchElementException when element doesn't exists
     */

    public static WebElement getElement(WebDriver driver, String xpath) {
        return driver.findElement(By.xpath(xpath));
    }

    /**
     * Get element by id
     *
     * @param driver driver to manager browser
     * @param id     id of element
     * @return WebEkement
     * @throws NoSuchElementException when element doesn't exists
     */

    public static WebElement getElementById(WebDriver driver, String id) {
        return driver.findElement(By.id(id));
    }

    /**
     * Get element by name
     *
     * @param driver driver to manager browser
     * @param name   name of element
     * @return WebElement
     * @throws NoSuchElementException when element doesn't exists
     */

    public static WebElement getElementByName(WebDriver driver, String name) {
        return driver.findElement(By.name(name));
    }

    /**
     * Get class by element
     *
     * @param driver    driver to manager browser
     * @param className class of element
     * @return WebElement
     * @throws NoSuchElementException when element doesn't exists
     */

    public static WebElement getElementByClass(WebDriver driver, String className) {
        return driver.findElement(By.className(className));
    }


}
