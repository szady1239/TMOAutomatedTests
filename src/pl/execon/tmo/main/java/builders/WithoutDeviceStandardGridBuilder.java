package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithoutDeviceStandardGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithoutDeviceStandardGrid;

public class WithoutDeviceStandardGridBuilder implements PageBuilderInterface {
    WithoutDeviceStandardGrid withoutDeviceStandardGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withoutDeviceStandardGrid = new WithoutDeviceStandardGrid();
        withoutDeviceStandardGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceStandardGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceStandardGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceStandardGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withoutDeviceStandardGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withoutDeviceStandardGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceStandardGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceStandardGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setFirstSectionLeftInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withoutDeviceStandardGrid.setFirstSectionRightInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withoutDeviceStandardGrid.setFirstSectionPrice(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_PRICE_CLASS));
        withoutDeviceStandardGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setFirstSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceStandardGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

        withoutDeviceStandardGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceStandardGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceStandardGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceStandardGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setSecondSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SMS_PT1_CLASS));
        withoutDeviceStandardGrid.setSecondSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SMS_PT2_CLASS));
        withoutDeviceStandardGrid.setSecondSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setSecondSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceStandardGrid.setSecondSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceStandardGrid.setSecondSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setSecondSectionLeftInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withoutDeviceStandardGrid.setSecondSectionRightInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withoutDeviceStandardGrid.setSecondSectionPrice(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_PRICE_CLASS));
        withoutDeviceStandardGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setSecondSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceStandardGrid.setSecondSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

    }

    @Override
    public PageInterface getPage() {
        return withoutDeviceStandardGrid;
    }
}
