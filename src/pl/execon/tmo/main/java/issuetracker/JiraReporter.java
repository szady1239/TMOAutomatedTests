package pl.execon.tmo.main.java.issuetracker;

import com.atlassian.jira.rest.client.api.JiraRestClient;
import com.atlassian.jira.rest.client.api.JiraRestClientFactory;
import com.atlassian.jira.rest.client.api.domain.BasicIssue;
import com.atlassian.jira.rest.client.api.domain.input.IssueInputBuilder;
import com.atlassian.jira.rest.client.internal.async.AsynchronousJiraRestClientFactory;
import com.atlassian.util.concurrent.Promise;
import org.testng.ITestResult;
import pl.execon.tmo.main.java.utils.Log;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

/**
 * Class used to create task on JIRA
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-07
 * @version 1.1
 */
public class JiraReporter extends AbstractIssueReporter implements IssueTrackerClientInterface {


    private URI serverUri;
    private JiraRestClientFactory restClientFactory;
    private String projectSummaryTemplate ="%s.%s %s %s";
    private long programStartTime;

    private int MAX_SUMMARY_SIZE = 255;
    private long ISSUE_TYPE_ID = 1L;
    private String ATTACHMENTS = "attachments";

    /**
     * Constructor used to init basic objects needed by Jira client
     * @param trackerConfiguration containing information about issue tracker configuration
     * @param programStartTime execution date as milliseconds
     */
    public JiraReporter(IssueTrackerConfiguration trackerConfiguration, long programStartTime) {
        super(trackerConfiguration);
        this.restClientFactory = new AsynchronousJiraRestClientFactory();
        this.programStartTime = programStartTime;
        try {
            this.serverUri = new URI(trackerConfiguration.getAddress());
        } catch (URISyntaxException e) {
            Log.error("Cant connect to JIRA. Reason: " + e.getMessage());
        }
    }


    /**
     * Create jira rest client based on data from issue tracker configuration object
     *
     * @return object needed to crate jira tasks
     * @throws Exception all unchecked jira exceptions
     */
    private JiraRestClient buildRestClient() throws Exception {
        if (serverUri != null) {
            return restClientFactory.createWithBasicHttpAuthentication(serverUri, trackerConfiguration.getLogin(), trackerConfiguration.getPassword());
        }
        return null;
    }

    /**
     * Prepare uri for send attachments
     *
     * @param taskUri basic task uri
     * @return uri used to send attachments
     * @throws URISyntaxException when uri is incorrect
     */
    private URI prepareAtachmentUri(URI taskUri) throws URISyntaxException {
        StringBuilder stringBuilder = new StringBuilder(taskUri.toString());
        if(!stringBuilder.toString().endsWith("/")) {
            stringBuilder.append("/");
        }
        stringBuilder.append(ATTACHMENTS);
        return new URI(stringBuilder.toString());
    }

    /**
     * Create task title
     *
     * @param testCaseName name of test case
     * @param errorMsg error description
     * @return full task title
     */
    private String prepareSummary(String testCaseName, String suiteName, String errorMsg) {
        String[] splitedErrorMsg = errorMsg.split("\n");
        String[] splitedSuiteName = suiteName.split("_");
        String browser = splitedSuiteName[1];
        if(suiteName.contains("mobile")){ browser += " mobile"; }
        String summary = String.format(projectSummaryTemplate, splitedSuiteName[0], testCaseName, browser, errorMsg);
        summary = summary.replaceAll("(\\r|\\n|\\t)", "");
        if(summary.length() > MAX_SUMMARY_SIZE) {
            summary = summary.substring(0, MAX_SUMMARY_SIZE);
        }
        return summary;
    }

    /**
     * Create issue on jira tracker using test result data
     *
     * @param testResult object contains information about test
     * @return true if task is successfully created, false if not
     */
    @Override
    public boolean createIssue(ITestResult testResult) {
        try {
            JiraRestClient restClient = buildRestClient();
            if(restClient != null) {
                String testCaseName = getTestCaseName(testResult);
                String summary = prepareSummary(testCaseName, testResult.getTestContext().getSuite().getName(), testResult.getThrowable().getMessage());

                String description = getDescription(testResult);
                IssueInputBuilder issueInputBuilder = new IssueInputBuilder(trackerConfiguration.getProjectName(), ISSUE_TYPE_ID, summary);
                issueInputBuilder = issueInputBuilder.setDescription(description);
                if(!trackerConfiguration.getComponentNames().isEmpty()) {
                    issueInputBuilder = issueInputBuilder.setComponentsNames(trackerConfiguration.getComponentNames());
                }
                issueInputBuilder = issueInputBuilder.setProjectKey(trackerConfiguration.getProjectName());
                Promise<BasicIssue> issuePromise = restClient.getIssueClient().createIssue(issueInputBuilder.build());
                URI taskUri = prepareAtachmentUri(issuePromise.get().getSelf());
                restClient.getIssueClient().addAttachments(taskUri, getAttachments(testCaseName, programStartTime));
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.error("Can't create JIRA ticket. Reason: ", e);
            return false;
        }
    }

    private String getDescription(ITestResult testResult) {
        Object[] parameters = testResult.getParameters();
        ArrayList<OrderInfo> casted;
        String description = "";
        if(parameters.length != 0 && parameters[0] instanceof ArrayList) {
            casted = (ArrayList<OrderInfo>)parameters[0];
            description = casted.get(0).toJiraDescription();
            description += "\n\n";
        }
        description += prepareTestStackTrace(testResult.getThrowable());
        return description;
    }
}
