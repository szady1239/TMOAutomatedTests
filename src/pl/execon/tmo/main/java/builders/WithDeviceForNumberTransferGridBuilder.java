package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithDeviceForNumberTransfersGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithDeviceForNumberTransfersGrid;

public class WithDeviceForNumberTransferGridBuilder implements PageBuilderInterface {
    WithDeviceForNumberTransfersGrid withDeviceForNumberTransfersGrid;


    @Override
    public void buildPage(WebDriver driver) {
        withDeviceForNumberTransfersGrid = new WithDeviceForNumberTransfersGrid();
        withDeviceForNumberTransfersGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionLeftInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionRightInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionConstantPrice(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_CONSTANT_PRICE_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionDynamicPrice(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_DYNAMIC_PRICE_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionVideoPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_VIDEO_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionVideoPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_VIDEO_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

        withDeviceForNumberTransfersGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SMS_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SMS_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_INTERNET_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_INTERNET_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionLeftInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionRightInternetAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionConstantPrice(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_CONSTANT_PRICE_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionDynamicPrice(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_DYNAMIC_PRICE_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionVideoPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_VIDEO_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionVideoPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_VIDEO_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));

        withDeviceForNumberTransfersGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SMS_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SMS_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_INTERNET_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_INTERNET_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionConstantPrice(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_CONSTANT_PRICE_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionDynamicPrice(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_DYNAMIC_PRICE_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionVideoPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_VIDEO_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionVideoPT2(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_VIDEO_PT2_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitPT1(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_PT1_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitTooltip(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_TOOLTIP_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitLeftChevron(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitRightChevron(WebUtils.getElementByClass(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CLASS));


    }

    @Override
    public PageInterface getPage() {
        return withDeviceForNumberTransfersGrid;
    }
}
