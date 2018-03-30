package pl.execon.tmo.main.java.issuetracker;
import org.testng.ITestResult;

/**
 * Interface used for issue trackers integration
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-07
 * @version 1.1
 */
public interface IssueTrackerClientInterface {

    /**
     * Method used for create task on issue tracker
     *
     * @param testResult object contains information about test
     * @return true if task created correctly, false if not
     */
    boolean createIssue(ITestResult testResult);
}
