package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithDeviceStandardGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithDeviceStandardGrid;

public class WithDeviceStandardGridBuilder implements PageBuilderInterface {
    WithDeviceStandardGrid withDeviceStandardGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withDeviceStandardGrid = new WithDeviceStandardGrid();
        withDeviceStandardGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceStandardGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT1_CSS));
        withDeviceStandardGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT2_CSS));
        withDeviceStandardGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceStandardGrid.setFirstSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SMS_PT1_CSS));
        withDeviceStandardGrid.setFirstSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SMS_PT2_CSS));
        withDeviceStandardGrid.setFirstSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SMS_TOOLTIP_CSS));
        withDeviceStandardGrid.setFirstSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT1_CSS));
        withDeviceStandardGrid.setFirstSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT2_CSS));
        withDeviceStandardGrid.setFirstSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceStandardGrid.setFirstSectionLeftInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceStandardGrid.setFirstSectionRightInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceStandardGrid.setFirstSectionPrice(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_PRICE_CSS));
        withDeviceStandardGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceStandardGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceStandardGrid.setFirstSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BONUS_INFORMATION_CSS));
        withDeviceStandardGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceStandardGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withDeviceStandardGrid.setFirstSectionVideoPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_VIDEO_PT1_CSS));
        withDeviceStandardGrid.setFirstSectionVideoPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_VIDEO_PT2_CSS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

        withDeviceStandardGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceStandardGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT1_CSS));
        withDeviceStandardGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT2_CSS));
        withDeviceStandardGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceStandardGrid.setSecondSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SMS_PT1_CSS));
        withDeviceStandardGrid.setSecondSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SMS_PT2_CSS));
        withDeviceStandardGrid.setSecondSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SMS_TOOLTIP_CSS));
        withDeviceStandardGrid.setSecondSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT1_CSS));
        withDeviceStandardGrid.setSecondSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT2_CSS));
        withDeviceStandardGrid.setSecondSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceStandardGrid.setSecondSectionLeftInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceStandardGrid.setSecondSectionRightInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceStandardGrid.setSecondSectionPrice(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_PRICE_CSS));
        withDeviceStandardGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceStandardGrid.setSecondSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceStandardGrid.setSecondSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BONUS_INFORMATION_CSS));
        withDeviceStandardGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceStandardGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withDeviceStandardGrid.setSecondSectionVideoPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_VIDEO_PT1_CSS));
        withDeviceStandardGrid.setSecondSectionVideoPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_VIDEO_PT2_CSS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));


        withDeviceStandardGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceStandardGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BILL_PAID_PT1_CSS));
        withDeviceStandardGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BILL_PAID_PT2_CSS));
        withDeviceStandardGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceStandardGrid.setThirdSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SMS_PT1_CSS));
        withDeviceStandardGrid.setThirdSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SMS_PT2_CSS));
        withDeviceStandardGrid.setThirdSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SMS_TOOLTIP_CSS));
        withDeviceStandardGrid.setThirdSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_INTERNET_PT1_CSS));
        withDeviceStandardGrid.setThirdSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_INTERNET_PT2_CSS));
        withDeviceStandardGrid.setThirdSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceStandardGrid.setThirdSectionPrice(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_PRICE_CSS));
        withDeviceStandardGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceStandardGrid.setThirdSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceStandardGrid.setThirdSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BONUS_INFORMATION_CSS));
        withDeviceStandardGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceStandardGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withDeviceStandardGrid.setThirdSectionVideoPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_VIDEO_PT1_CSS));
        withDeviceStandardGrid.setThirdSectionVideoPT2(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_VIDEO_PT2_CSS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));


    }

    @Override
    public PageInterface getPage() {
        return withDeviceStandardGrid;
    }
}
