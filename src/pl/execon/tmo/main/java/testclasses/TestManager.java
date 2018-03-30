package pl.execon.tmo.main.java.testclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.reporters.TestHTMLReporter;
import pl.execon.tmo.main.java.builders.PageDirector;
import pl.execon.tmo.main.java.data.Configuration;
import pl.execon.tmo.main.java.data.SupportedBrowsers;
import pl.execon.tmo.main.java.utils.*;

import java.io.IOException;
import java.util.List;

/**
 * Main TestClass
 *
 * @author Oskar Kleska date: 29 kwi 2016
 */
public abstract class TestManager {

    public static final String DEFAULT_REPORT_DIRECTORY = "report";
    public static final int FIRST_PARAM_INDEX = 0;
    public static final int SECOND_PARAM_INDEX = 1;
    public static final int TEST_DATA_TABLE_SIZE = 0;
    private static final int WAIT_TIME = 3;
    protected WebDriver driver;
    PageDirector pageDirector = new PageDirector();
    /**
     * Initialization of variables
     */
    private BrowserInvoker browserInvoker = new BrowserInvoker();
    private WebDriverWait wait;
    private Configuration configuration = ConfigurationManager.getInstance().getConfiguration();
    private List<String> tcToRun;
    private String suiteName;
    private TestManagerMethodsInterface managerMethods;

    protected TestManager(String suiteName) {
        this.suiteName = suiteName;
    }

    private List<String> getTcToRun() throws IOException {
        String tcSource = configuration.getTcSources().get(suiteName);
        return TestDataManager.getInstance().getTcToRun(tcSource);
    }


    protected void setManagerMethods(TestManagerMethodsInterface managerMethods) {
        this.managerMethods = managerMethods;
    }

    /**
     * Standard TestNG method called before the tests. Method reads the configuration, initialize
     * logger, screenshot listener, reporter and browser.
     *
     * @param ctx
     * @throws InterruptedException
     */
    @BeforeSuite
    @Parameters({"browser"})
    protected void beforeSuite(ITestContext ctx, String browser) throws InterruptedException {
        try {
            TestRunner runner = (TestRunner) ctx;
            String reportDir = configuration.getReportOutputDirectory();

            if (reportDir == null || reportDir.isEmpty()) {
                runner.setOutputDirectory(DEFAULT_REPORT_DIRECTORY);
            } else {
                runner.setOutputDirectory(configuration.getReportOutputDirectory());
            }

            runner.addListener((TestHTMLReporter) new TestReportGenerator());

            SupportedBrowsers supportedBrowser = SupportedBrowsers.valueOf(browser);
            driver =
                    BrowserInvoker.prepareWebDriver(supportedBrowser, configuration.getApplicationAddress());
            wait = new WebDriverWait(driver, WAIT_TIME);
            ScreenshotListener.createScreenshotListener(driver, configuration.getScreenshotDirectoryPath(), configuration.getScreenshotWriter(), supportedBrowser, reportDir);
            if (managerMethods != null) {
                managerMethods.beforeSuite();
            }
        } catch (Exception e) {
            Log.error("Błąd podczas tworzenia konfiguracji", e);
            Assert.fail("Błąd podczas tworzenia konfiguracji");
        }
    }

    /**
     * Standard TestNG method called after the tests. Method closes the browser.
     *
     * @throws InterruptedException
     */
    @AfterSuite
    protected void afterSuite() throws InterruptedException {
        try {
            browserInvoker.afterSuite(driver);
            if (managerMethods != null) {
                managerMethods.afterSuite();
            }
        } catch (Exception e) {
            Log.error("Błąd podczas kończenia testów", e);
            Assert.fail("Błąd podczas kończenia testów");
        }
    }

    /**
     * Standard TestNG method called after test. Method log out from application and if test result is
     * failiture method take screenshot.
     *
     * @throws InterruptedException
     */
    @AfterMethod
    protected void afterMethod() throws InterruptedException {
        try {
            if (managerMethods != null) {
                managerMethods.afterMethod();
            }
        } catch (Exception e) {
            Log.info("We're already logged out - skip", e);
        } finally {
            ScreenshotListener.getListener().resetCounter();
        }
    }

    protected boolean shouldRunTestCase(String testCaseName) throws IOException {
        if (tcToRun == null) {
            tcToRun = getTcToRun();
        }
        return tcToRun.contains(testCaseName);
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public ScreenshotListener getScreenshotListener() {
        return ScreenshotListener.getListener();
    }


}
