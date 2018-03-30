package pl.execon.tmo.main.java.webelements;

import org.openqa.selenium.WebElement;
import pl.execon.tmo.main.java.builders.PageInterface;

public class Header implements PageInterface {
    private WebElement devicesMenu;
    private WebElement offersMenu;
    private WebElement phonesSubMenu;
    private WebElement routerSubMenu;
    private WebElement tabletsSubMenu;
    private WebElement subscriptionSubMenu;

    public WebElement getDevicesMenu() {
        return devicesMenu;
    }

    public void setDevicesMenu(WebElement devicesMenu) {
        this.devicesMenu = devicesMenu;
    }

    public WebElement getOffersMenu() {
        return offersMenu;
    }

    public void setOffersMenu(WebElement offersMenu) {
        this.offersMenu = offersMenu;
    }

    public WebElement getPhonesSubMenu() {
        return phonesSubMenu;
    }

    public void setPhonesSubMenu(WebElement phonesSubMenu) {
        this.phonesSubMenu = phonesSubMenu;
    }

    public WebElement getRouterSubMenu() {
        return routerSubMenu;
    }

    public void setRouterSubMenu(WebElement routerSubMenu) {
        this.routerSubMenu = routerSubMenu;
    }

    public WebElement getTabletsSubMenu() {
        return tabletsSubMenu;
    }

    public void setTabletsSubMenu(WebElement tabletsSubMenu) {
        this.tabletsSubMenu = tabletsSubMenu;
    }

    public WebElement getSubscriptionSubMenu() {
        return subscriptionSubMenu;
    }

    public void setSubscriptionSubMenu(WebElement subscriptionSubMenu) {
        this.subscriptionSubMenu = subscriptionSubMenu;
    }
}
