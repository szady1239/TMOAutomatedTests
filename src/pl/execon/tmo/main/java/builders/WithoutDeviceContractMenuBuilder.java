package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithoutDeviceContractMenuLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithoutDeviceContractMenu;

public class WithoutDeviceContractMenuBuilder implements PageBuilderInterface {
    WithoutDeviceContractMenu contractMenu;

    @Override
    public void buildPage(WebDriver driver) {
        contractMenu = new WithoutDeviceContractMenu();
        contractMenu.setOnlineOnly(WebUtils.getElementByClass(driver, WithoutDeviceContractMenuLocators.ONLINE_ONLY_CLASS));
        contractMenu.setStandard(WebUtils.getElementByClass(driver, WithoutDeviceContractMenuLocators.STANDARD_CLASS));
        contractMenu.settMobileNoLimit(WebUtils.getElementByClass(driver, WithoutDeviceContractMenuLocators.TMOBILE_NO_LIMIT_CLASS));
    }

    @Override
    public PageInterface getPage() {
        return contractMenu;
    }
}
