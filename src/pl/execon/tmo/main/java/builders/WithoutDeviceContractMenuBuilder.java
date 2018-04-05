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
        contractMenu.setOnlineOnly(WebUtils.getElementByCSS(driver, WithoutDeviceContractMenuLocators.ONLINE_ONLY_CSS));
        contractMenu.setStandard(WebUtils.getElementByCSS(driver, WithoutDeviceContractMenuLocators.STANDARD_CSS));
        contractMenu.settMobileNoLimit(WebUtils.getElementByCSS(driver, WithoutDeviceContractMenuLocators.TMOBILE_NO_LIMIT_CSS));
    }

    @Override
    public PageInterface getPage() {
        return contractMenu;
    }
}
