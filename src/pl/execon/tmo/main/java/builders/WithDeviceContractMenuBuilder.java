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
        contractMenu.setForNumberTransfer(WebUtils.getElementByCSS(driver, WithDeviceContractMenuLocators.FOR_NUMBER_TRANSFER_CSS));
        contractMenu.setStandard(WebUtils.getElementByCSS(driver, WithDeviceContractMenuLocators.STANDARD_CSS));
        contractMenu.setThreeYearSubscription(WebUtils.getElementByCSS(driver, WithDeviceContractMenuLocators.THREE_YEAR_SUBSCRIPTION_CSS));
        contractMenu.settMobileNoLimit(WebUtils.getElementByCSS(driver, WithDeviceContractMenuLocators.TMOBILE_NO_LIMIT_CSS));
    }

    @Override
    public PageInterface getPage() {
        return contractMenu;
    }
}
