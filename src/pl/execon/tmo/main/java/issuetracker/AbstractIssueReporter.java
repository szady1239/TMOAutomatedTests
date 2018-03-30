package pl.execon.tmo.main.java.issuetracker;

import org.testng.ITestResult;
import pl.execon.tmo.main.java.utils.ConfigurationManager;
import pl.execon.tmo.main.java.utils.Log;
import pl.execon.tmo.main.java.data.Configuration;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Basic class for all issue tracker reporters
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-07
 * @version 1.0
 */
public class AbstractIssueReporter {

    protected IssueTrackerConfiguration trackerConfiguration;
    private String NO_FOLDER_ACCESS_ERR = "No access to attachment folder";
    private String NO_EXISTS_FOLDER_ERR = "Attachments folder not exists or is not directory";

    /**
     * Constructor
     *
     * @param trackerConfiguration object with configuration. We can get this from Configuration object
     * @see Configuration
     */

    protected AbstractIssueReporter(IssueTrackerConfiguration trackerConfiguration) {
        this.trackerConfiguration = trackerConfiguration;
    }

    /**
     * Read stacktrace from throwable object
     *
     * @param cause contains information about reasons of test fail
     * @return stack trace converted to string
     */

    protected String prepareTestStackTrace(Throwable cause) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        if (null != cause) {
            cause.printStackTrace(pw);
        }
        return sw.toString();
    }

    /**
     * Get test case name as upper case
     *
     * @param testResult result of tests
     * @return test case name as upper case
     */

    protected String getTestCaseName(ITestResult testResult) {
        return testResult.getMethod().getMethodName().toUpperCase();
    }

    /**
     * Get list of screenshot created when execute tests
     *
     * @param testCaseName name of test case (in upper case)
     * @param programStartTime run engine time as milliseconds
     * @return array of files with screens created when execute test. If no files are found return empty list
     */

    protected File[] getAttachments(String testCaseName, long programStartTime) {
        Long actualTime = new Date().getTime();
        String attachmentsFolder = ConfigurationManager.getInstance().getConfiguration().getScreenshotDirectoryPath();
        File attachmentsFolderFile = new File(attachmentsFolder);
        if(attachmentsFolderFile.exists() && attachmentsFolderFile.isDirectory()) {
            File[] folderContent = attachmentsFolderFile.listFiles();
            if(folderContent != null) {
                List<File> resultFileList = new ArrayList<>();
                for(File file : folderContent) {
                    String[] splitedFileName = file.getName().split("_");
                    long attachmentCreationTime = Long.parseLong(splitedFileName[3]);
                    String tcName_Set =  splitedFileName[0] + "_" + splitedFileName[1];
                    if(attachmentCreationTime >= programStartTime && attachmentCreationTime<= actualTime && tcName_Set.equals(testCaseName)) {
                        resultFileList.add(file);
                    }
                }
                File[] resultFileArray = new File[resultFileList.size()];
                resultFileList.toArray(resultFileArray);
                return resultFileArray;
            } else {
                Log.info(NO_FOLDER_ACCESS_ERR);
                return new File[] { };

            }
        } else {
            Log.info(NO_EXISTS_FOLDER_ERR);
            return new File[] { };
        }
    }
}
