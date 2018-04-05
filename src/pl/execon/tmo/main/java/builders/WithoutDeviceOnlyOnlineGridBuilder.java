package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithoutDeviceOnlyOnlineGirdLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithoutDeviceOnlineOnlyGrid;

public class WithoutDeviceOnlyOnlineGridBuilder implements PageBuilderInterface {
    WithoutDeviceOnlineOnlyGrid withoutDeviceOnlineOnlyGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withoutDeviceOnlineOnlyGrid = new WithoutDeviceOnlineOnlyGrid();
        withoutDeviceOnlineOnlyGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SMS_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SMS_PT2_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_INTERNET_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_INTERNET_PT2_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionPrice(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_PRICE_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

        withoutDeviceOnlineOnlyGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SMS_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SMS_PT2_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_INTERNET_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_INTERNET_PT2_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionPrice(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_PRICE_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

    }

    @Override
    public PageInterface getPage() {
        return withoutDeviceOnlineOnlyGrid;
    }
}
