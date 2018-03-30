package pl.execon.tmo.main.java.utils;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import pl.execon.tmo.main.java.data.SupportedBrowsers;
import pl.execon.tmo.main.java.data.Configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * Class managing browsers
 *
 * @author Oskar Kleska
 * @author Pawel Lagodzinski
 * @version 1.0
 * @since 28 kwi 2016
 */
public class BrowserInvoker {
    private static final int WAIT_TIME = 10;
    private static final int TWO = 2;
    private static final int THIRDTEEN = 30;
    private static int defaultMobileChromeWidth = 300;
    private static int defaultMobileChromeHeight = 600;

    /**
     * Prepare firefox settings
     *
     * @return object contains special firefox settings
     */

    private static FirefoxProfile firefoxDownloadProfile() {
        // Downloaded content type is octet-stream, but I'm leaving pdf config in case of any changes.
        FirefoxProfile firefoxProfile = new FirefoxProfile();
        firefoxProfile.setPreference("plugin.disable_full_page_plugin_for_types",
                "application/pdf,application/vnd.adobe.xfdf,application/vnd.fdf,application/vnd.adobe.xdp+xml");
        firefoxProfile.setPreference("browser.download.folderList", TWO);
        firefoxProfile.setPreference("browser.download.useDownloadDir", Boolean.TRUE);
        firefoxProfile.setPreference("browser.download.manager.showWhenStarting", Boolean.FALSE);
        firefoxProfile.setPreference("browser.download.dir", ConfigurationManager.getInstance()
                .getConfiguration().getDownloadFolder().getAbsolutePath());
        firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "application/pdf,application/octet-stream");
        firefoxProfile.setPreference("pdfjs.disabled", Boolean.TRUE);

        // Use this to disable Acrobat plugin for previewing PDFs in Firefox (if you have Adobe reader
        // installed on your computer)
        firefoxProfile.setPreference("plugin.scan.Acrobat", "99.0");
        firefoxProfile.setPreference("plugin.scan.plid.all", Boolean.FALSE);

        return firefoxProfile;
    }

    /**
     * Get configured web driver
     *
     * @param browser            type of browser for which is to be generated driver
     * @param applicationAddress start page for driver, get this from configuration object
     * @return configured WebDriver object
     * @see Configuration
     */

    public static WebDriver prepareWebDriver(SupportedBrowsers browser, String applicationAddress) {
        WebDriver webDriver = null;
        switch (browser) {
            case FIREFOX:
                webDriver = new FirefoxDriver();
                webDriver.manage().window().maximize();
                break;
            case CHROME:
                Map<String, Object> prefs = new HashMap<>();
                prefs.put("download.default_directory", ConfigurationManager.getInstance()
                        .getConfiguration().getDownloadFolder().getAbsolutePath());
                prefs.put("profile.default_content_settings.popups", 0);
                DesiredCapabilities caps = DesiredCapabilities.chrome();
                ChromeOptions options = new ChromeOptions();
                options.setExperimentalOption("prefs", prefs);
                caps.setCapability(ChromeOptions.CAPABILITY, options);
                webDriver = new ChromeDriver(caps);
                webDriver.manage().window().maximize();
                break;
            case CHROME_MOBILE:
                if (ConfigurationManager.getInstance()
                        .getConfiguration().getMobileWidth() != "") {
                    defaultMobileChromeWidth = Integer.valueOf(ConfigurationManager.getInstance()
                            .getConfiguration().getMobileWidth());

                } else if (ConfigurationManager.getInstance()
                        .getConfiguration().getMobileHeight() != "") {
                    defaultMobileChromeHeight = Integer.valueOf(ConfigurationManager.getInstance()
                            .getConfiguration().getMobileHeight());
                }
                Map<String, Object> prefs_mobile = new HashMap<>();
                prefs_mobile.put("download.default_directory", ConfigurationManager.getInstance()
                        .getConfiguration().getDownloadFolder().getAbsolutePath());
                prefs_mobile.put("profile.default_content_settings.popups", 0);
                DesiredCapabilities caps_mobile = DesiredCapabilities.chrome();
                ChromeOptions options_mobile = new ChromeOptions();
                options_mobile.setExperimentalOption("prefs", prefs_mobile);
                caps_mobile.setCapability(ChromeOptions.CAPABILITY, options_mobile);
                webDriver = new ChromeDriver(caps_mobile);
                webDriver.manage().window().setSize(new Dimension(defaultMobileChromeWidth, defaultMobileChromeHeight));
                break;
            default:
                break;
        }
        webDriver.get(applicationAddress);
        webDriver.manage().timeouts().implicitlyWait(WAIT_TIME, TimeUnit.SECONDS);
        return webDriver;

    }

    /**
     * Method called after execution of last test from suite that closes browser.
     *
     * @param driver Web driver with browser instance.
     */
    public void afterSuite(WebDriver driver) {
        driver.quit();
    }
}
