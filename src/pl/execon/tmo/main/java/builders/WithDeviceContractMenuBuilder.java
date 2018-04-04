package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithDeviceContractMenuLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithDeviceContractMenu;

public class WithDeviceContractMenuBuilder implements PageBuilderInterface{
    WithDeviceContractMenu contractMenu;
    @Override
    public void buildPage(WebDriver driver) {
        contractMenu = new WithDeviceContractMenu();
        contractMenu.setForNumberTransfer(WebUtils.getElementByClass(driver, WithDeviceContractMenuLocators.FOR_NUMBER_TRANSFER_CLASS));
        contractMenu.setStandard(WebUtils.getElementByClass(driver, WithDeviceContractMenuLocators.STANDARD_CLASS));
        contractMenu.setThreeYearSubscription(WebUtils.getElementByClass(driver, WithDeviceContractMenuLocators.THREE_YEAR_SUBSCRIPTION_CLASS));
        contractMenu.settMobileNoLimit(WebUtils.getElementByClass(driver, WithDeviceContractMenuLocators.TMOBILE_NO_LIMIT_CLASS));
    }

    @Override
    public PageInterface getPage() {
        return contractMenu;
    }
}
