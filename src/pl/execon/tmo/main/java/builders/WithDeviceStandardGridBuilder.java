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
        withDeviceStandardGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceStandardGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceStandardGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceStandardGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceStandardGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withDeviceStandardGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withDeviceStandardGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceStandardGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withDeviceStandardGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withDeviceStandardGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceStandardGrid.setFirstSectionLeftInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceStandardGrid.setFirstSectionRightInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceStandardGrid.setFirstSectionPrice(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_PRICE_CLASS));
        withDeviceStandardGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceStandardGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceStandardGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceStandardGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceStandardGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withDeviceStandardGrid.setFirstSectionVideoPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_VIDEO_PT1_CLASS));
        withDeviceStandardGrid.setFirstSectionVideoPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_VIDEO_PT2_CLASS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withDeviceStandardGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

        withDeviceStandardGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceStandardGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceStandardGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceStandardGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceStandardGrid.setSecondSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SMS_PT1_CLASS));
        withDeviceStandardGrid.setSecondSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SMS_PT2_CLASS));
        withDeviceStandardGrid.setSecondSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceStandardGrid.setSecondSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT1_CLASS));
        withDeviceStandardGrid.setSecondSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_INTERNET_PT2_CLASS));
        withDeviceStandardGrid.setSecondSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceStandardGrid.setSecondSectionLeftInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceStandardGrid.setSecondSectionRightInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceStandardGrid.setSecondSectionPrice(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_PRICE_CLASS));
        withDeviceStandardGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceStandardGrid.setSecondSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceStandardGrid.setSecondSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceStandardGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceStandardGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withDeviceStandardGrid.setSecondSectionVideoPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_VIDEO_PT1_CLASS));
        withDeviceStandardGrid.setSecondSectionVideoPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_VIDEO_PT2_CLASS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withDeviceStandardGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));


        withDeviceStandardGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceStandardGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceStandardGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceStandardGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceStandardGrid.setThirdSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SMS_PT1_CLASS));
        withDeviceStandardGrid.setThirdSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SMS_PT2_CLASS));
        withDeviceStandardGrid.setThirdSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceStandardGrid.setThirdSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_INTERNET_PT1_CLASS));
        withDeviceStandardGrid.setThirdSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_INTERNET_PT2_CLASS));
        withDeviceStandardGrid.setThirdSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceStandardGrid.setThirdSectionPrice(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_PRICE_CLASS));
        withDeviceStandardGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceStandardGrid.setThirdSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceStandardGrid.setThirdSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceStandardGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceStandardGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withDeviceStandardGrid.setThirdSectionVideoPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_VIDEO_PT1_CLASS));
        withDeviceStandardGrid.setThirdSectionVideoPT2(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_VIDEO_PT2_CLASS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withDeviceStandardGrid.setThirdSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithDeviceStandardGridLocators.THIRD_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));


    }

    @Override
    public PageInterface getPage() {
        return withDeviceStandardGrid;
    }
}
