package pl.execon.tmo.main.java.webelements;

import org.openqa.selenium.WebElement;
import pl.execon.tmo.main.java.builders.PageInterface;

public class WithoutDeviceContractMenu implements PageInterface {
    private WebElement tMobileNoLimit;
    private WebElement standard;
    private WebElement onlineOnly;

    public WebElement gettMobileNoLimit() {
        return tMobileNoLimit;
    }

    public void settMobileNoLimit(WebElement tMobileNoLimit) {
        this.tMobileNoLimit = tMobileNoLimit;
    }

    public WebElement getStandard() {
        return standard;
    }

    public void setStandard(WebElement standard) {
        this.standard = standard;
    }

    public WebElement getOnlineOnly() {
        return onlineOnly;
    }

    public void setOnlineOnly(WebElement onlineOnly) {
        this.onlineOnly = onlineOnly;
    }
}
