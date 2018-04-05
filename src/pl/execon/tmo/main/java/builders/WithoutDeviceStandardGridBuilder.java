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
        withoutDeviceStandardGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceStandardGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceStandardGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceStandardGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setFirstSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SMS_PT1_CSS));
        withoutDeviceStandardGrid.setFirstSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SMS_PT2_CSS));
        withoutDeviceStandardGrid.setFirstSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setFirstSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT1_CSS));
        withoutDeviceStandardGrid.setFirstSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT2_CSS));
        withoutDeviceStandardGrid.setFirstSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setFirstSectionLeftInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withoutDeviceStandardGrid.setFirstSectionRightInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withoutDeviceStandardGrid.setFirstSectionPrice(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_PRICE_CSS));
        withoutDeviceStandardGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceStandardGrid.setFirstSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceStandardGrid.setFirstSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceStandardGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceStandardGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withoutDeviceStandardGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

        withoutDeviceStandardGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceStandardGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceStandardGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceStandardGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setSecondSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SMS_PT1_CSS));
        withoutDeviceStandardGrid.setSecondSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SMS_PT2_CSS));
        withoutDeviceStandardGrid.setSecondSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setSecondSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT1_CSS));
        withoutDeviceStandardGrid.setSecondSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT2_CSS));
        withoutDeviceStandardGrid.setSecondSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setSecondSectionLeftInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withoutDeviceStandardGrid.setSecondSectionRightInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withoutDeviceStandardGrid.setSecondSectionPrice(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_PRICE_CSS));
        withoutDeviceStandardGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceStandardGrid.setSecondSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceStandardGrid.setSecondSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceStandardGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceStandardGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withoutDeviceStandardGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithoutDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

    }

    @Override
    public PageInterface getPage() {
        return withoutDeviceStandardGrid;
    }
}
