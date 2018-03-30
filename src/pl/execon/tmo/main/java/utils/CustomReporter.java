package pl.execon.tmo.main.java.utils;

import org.testng.*;
import org.testng.internal.IResultListener2;
import org.testng.xml.XmlSuite;
import pl.execon.tmo.main.java.configuration.RunProfile;
import pl.execon.tmo.main.java.data.Configuration;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerClientInterface;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerConfiguration;
import pl.execon.tmo.main.java.issuetracker.IssueTrackerManager;

import java.util.ArrayList;
import java.util.List;

public class CustomReporter implements ITestListener, IResultListener2, IReporter {


  private IssueTrackerClientInterface clientInterface;
  private CustomReportGenerator reportGenerator;
  private RunProfile profile;
  private static List<ITestResult> testResults = new ArrayList<>();


  public CustomReporter(RunProfile profile, long startProgramTime,
                        CustomReportGenerator reportGenerator) {

    IssueTrackerConfiguration issueTrackerConfiguration =
        ConfigurationManager.getInstance().getConfiguration().getIssueTrackerConfiguration();
    clientInterface =
        IssueTrackerManager.getIssueTrackerClient(issueTrackerConfiguration, startProgramTime);
    this.reportGenerator = reportGenerator;
    this.profile = profile;
  }

  @Override
  public void onTestStart(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void onTestSuccess(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void onTestFailure(ITestResult iTestResult) {
    ScreenshotListener.getListener().takeAndSaveScreenshot(true);
    if (profile == RunProfile.PRODUCTION) {
      if (clientInterface != null && !testResults.contains(iTestResult)) {
        Log.info("Create issue on issue tracker");
        boolean ifCreated = clientInterface.createIssue(iTestResult);
        testResults.add(iTestResult);
        if(ifCreated) { Log.info("Task on issue tracker created successfully"); }
      }
    }
  }

  @Override
  public void onTestSkipped(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void onStart(ITestContext iTestContext) {
    // NOT USED
  }

  @Override
  public void onFinish(ITestContext iTestContext) {
    // NOT USED
  }

  @Override
  public void beforeConfiguration(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void onConfigurationSuccess(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void onConfigurationFailure(ITestResult iTestResult) {
    Log.info("Configuration error: " + iTestResult.getThrowable().getMessage());
  }

  @Override
  public void onConfigurationSkip(ITestResult iTestResult) {
    // NOT USED
  }

  @Override
  public void generateReport(List<XmlSuite> xml, List<ISuite> suites, String outdir) {

    if(profile == RunProfile.PRODUCTION) {
      EmailReporter reporter = EmailReporter.getInstance();
      Configuration configuration = ConfigurationManager.getInstance().getConfiguration();

      Log.info("Generate report");
      String report = null;
      String reportDirectory = configuration.getReportDirectory();
      if (this.reportGenerator != null) {
        report = this.reportGenerator.generateStringReport(suites);
        this.reportGenerator.generateFileReport(suites, reportDirectory);
      }
      Log.info("Report generated. Sending");

      reporter.sendEmail(configuration.getMailInfoData(), report,
          reportDirectory);
      Log.info("Report sent");
    }

  }

}
