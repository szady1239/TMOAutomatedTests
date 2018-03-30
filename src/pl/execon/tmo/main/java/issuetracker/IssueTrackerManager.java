package pl.execon.tmo.main.java.issuetracker;

/**
 * Class used to manage issue tracker client
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-07
 * @version 1.0
 */
public class IssueTrackerManager {

    private IssueTrackerManager() { }

    /**
     * Method create specialized class for issue tracker based on configuration data
     *
     * @param trackerConfiguration object containing information needed to build issue tracker class
     * @param startApplicationTime time of start application (from the beginning of unix era).
     * @return object of issue tracker specialized class or null if can't create specialized class
     */

    public static IssueTrackerClientInterface getIssueTrackerClient(IssueTrackerConfiguration trackerConfiguration, long startApplicationTime) {
        IssueTrackerClientInterface client;

        switch (trackerConfiguration.getTrackerType()) {
            case JIRA:
                client = new JiraReporter(trackerConfiguration, startApplicationTime);
                return client;
            case NONE:
                return null;
            default:
                return null;
        }
    }

}
