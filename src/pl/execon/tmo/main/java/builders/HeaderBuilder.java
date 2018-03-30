package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.HeaderLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.Header;

public class HeaderBuilder implements PageBuilderInterface {
    Header header;
    @Override
    public void buildPage(WebDriver driver) {
        header = new Header();
        header.setDevicesMenu(WebUtils.getElementByClass(driver, HeaderLocators.DEVICES_MENU_CLASS));
        header.setOffersMenu(WebUtils.getElementByClass(driver, HeaderLocators.OFFERS_MENU_CLASS));
        header.setPhonesSubMenu(WebUtils.getElementByClass(driver, HeaderLocators.PHONES_SUBMENU_CLASS));
        header.setRouterSubMenu(WebUtils.getElementByClass(driver, HeaderLocators.ROUTERS_SUBMENU_CLASS));
        header.setTabletsSubMenu(WebUtils.getElementByClass(driver, HeaderLocators.TABLETS_SUBMENU_CLASS));
        header.setSubscriptionSubMenu(WebUtils.getElementByClass(driver, HeaderLocators.SUBSCRIPTION_SUBMENU_CLASS));
    }

    @Override
    public PageInterface getPage() {
        return header;
    }
}
