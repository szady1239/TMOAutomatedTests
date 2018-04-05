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
        header.setDevicesMenu(WebUtils.getElementByCSS(driver, HeaderLocators.DEVICES_MENU_CSS));
        header.setOffersMenu(WebUtils.getElementByCSS(driver, HeaderLocators.OFFERS_MENU_CSS));
        header.setPhonesSubMenu(WebUtils.getElementByCSS(driver, HeaderLocators.PHONES_SUBMENU_CSS));
        header.setRouterSubMenu(WebUtils.getElementByCSS(driver, HeaderLocators.ROUTERS_SUBMENU_CSS));
        header.setTabletsSubMenu(WebUtils.getElementByCSS(driver, HeaderLocators.TABLETS_SUBMENU_CSS));
        header.setSubscriptionSubMenu(WebUtils.getElementByCSS(driver, HeaderLocators.SUBSCRIPTION_SUBMENU_CSS));
    }

    @Override
    public PageInterface getPage() {
        return header;
    }
}
