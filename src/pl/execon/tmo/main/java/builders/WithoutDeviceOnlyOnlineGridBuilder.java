package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithoutDeviceOnlyOnlineGirdLocators;
import pl.execon.tmo.main.java.locators.WithoutDeviceStandardGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithoutDeviceOnlineOnlyGrid;

public class WithoutDeviceOnlyOnlineGridBuilder implements PageBuilderInterface {
    WithoutDeviceOnlineOnlyGrid withoutDeviceOnlineOnlyGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withoutDeviceOnlineOnlyGrid = new WithoutDeviceOnlineOnlyGrid();
        withoutDeviceOnlineOnlyGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionPrice(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_PRICE_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withoutDeviceOnlineOnlyGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

        withoutDeviceOnlineOnlyGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SMS_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SMS_PT2_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionPrice(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_PRICE_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withoutDeviceOnlineOnlyGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithoutDeviceOnlyOnlineGirdLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

    }

    @Override
    public PageInterface getPage() {
        return withoutDeviceOnlineOnlyGrid;
    }
}
