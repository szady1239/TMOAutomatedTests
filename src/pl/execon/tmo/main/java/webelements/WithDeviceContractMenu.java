package pl.execon.tmo.main.java.webelements;

import org.openqa.selenium.WebElement;
import pl.execon.tmo.main.java.builders.PageInterface;

public class WithDeviceContractMenu implements PageInterface {
    private WebElement tMobileNoLimit;
    private WebElement standard;
    private WebElement forNumberTransfer;
    private WebElement threeYearSubscription;

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

    public WebElement getForNumberTransfer() {
        return forNumberTransfer;
    }

    public void setForNumberTransfer(WebElement forNumberTransfer) {
        this.forNumberTransfer = forNumberTransfer;
    }

    public WebElement getThreeYearSubscription() {
        return threeYearSubscription;
    }

    public void setThreeYearSubscription(WebElement threeYearSubscription) {
        this.threeYearSubscription = threeYearSubscription;
    }
}
