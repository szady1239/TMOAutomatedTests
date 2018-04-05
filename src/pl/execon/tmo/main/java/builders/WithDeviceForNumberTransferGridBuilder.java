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
        withDeviceForNumberTransfersGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BILL_PAID_PT1_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BILL_PAID_PT2_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SMS_PT1_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SMS_PT2_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SMS_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_INTERNET_PT1_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_INTERNET_PT2_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionLeftInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionRightInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionConstantPrice(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_CONSTANT_PRICE_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionDynamicPrice(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_DYNAMIC_PRICE_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_BONUS_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionVideoPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_VIDEO_PT1_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionVideoPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_VIDEO_PT2_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withDeviceForNumberTransfersGrid.setFirstSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.FIRST_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

        withDeviceForNumberTransfersGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BILL_PAID_PT1_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BILL_PAID_PT2_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SMS_PT1_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SMS_PT2_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SMS_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_INTERNET_PT1_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_INTERNET_PT2_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionLeftInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_LEFT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionRightInternetAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_RIGHT_INTERNET_ADJUSTMENT_BUTTON_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionConstantPrice(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_CONSTANT_PRICE_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionDynamicPrice(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_DYNAMIC_PRICE_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setSecondSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_BONUS_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionVideoPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_VIDEO_PT1_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionVideoPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_VIDEO_PT2_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withDeviceForNumberTransfersGrid.setSecondSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.SECOND_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));

        withDeviceForNumberTransfersGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BILL_PAID_PT1_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BILL_PAID_PT2_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SMS_PT1_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SMS_PT2_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SMS_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_INTERNET_PT1_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_INTERNET_PT2_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionConstantPrice(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_CONSTANT_PRICE_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionDynamicPrice(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_DYNAMIC_PRICE_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceForNumberTransfersGrid.setThirdSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_BONUS_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionVideoPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_VIDEO_PT1_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionVideoPT2(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_VIDEO_PT2_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitPT1(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_PT1_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitTooltip(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_TOOLTIP_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitLeftChevron(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_LEFT_CHEVRON_CSS));
        withDeviceForNumberTransfersGrid.setThirdSectionAppsNoLimitRightChevron(WebUtils.getElementByCSS(driver, WithDeviceForNumberTransfersGridLocators.THIRD_SECTION_APPS_NO_LIMIT_RIGHT_CHEVRON_CSS));


    }

    @Override
    public PageInterface getPage() {
        return withDeviceForNumberTransfersGrid;
    }
}
