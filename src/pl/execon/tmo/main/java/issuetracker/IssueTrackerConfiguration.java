package pl.execon.tmo.main.java.issuetracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Class used to storage information needed by IssueTrackerManager
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-07
 * @version 1.0
 */
public class IssueTrackerConfiguration {
    private String login;
    private String password;
    private String address;
    private String projectName;
    private IssueTrackerType trackerType;
    private List<String> componentNames;

    public IssueTrackerConfiguration() {
        componentNames = new ArrayList<>();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<String> getComponentNames() {
        return componentNames;
    }

    public void setComponentNames(List<String> componentNames) {
        this.componentNames = componentNames;
    }

    public IssueTrackerType getTrackerType() {
        return trackerType;
    }

    public void setTrackerType(IssueTrackerType trackerType) {
        this.trackerType = trackerType;
    }

}

