package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithDeviceNoLimitGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithDeviceNoLimitGrid;

public class WithDeviceNoLimitGridBuilder implements PageBuilderInterface {
    WithDeviceNoLimitGrid withDeviceNoLimitGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withDeviceNoLimitGrid = new WithDeviceNoLimitGrid();

        withDeviceNoLimitGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceNoLimitGrid.setFirstSectionOfferHeaderPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_OFFER_HEADER_PT2_CSS));
        withDeviceNoLimitGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT1_CSS));
        withDeviceNoLimitGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT2_CSS));
        withDeviceNoLimitGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setFirstSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT1_CSS));
        withDeviceNoLimitGrid.setFirstSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT2_CSS));
        withDeviceNoLimitGrid.setFirstSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SMS_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setFirstSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT1_CSS));
        withDeviceNoLimitGrid.setFirstSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT2_CSS));
        withDeviceNoLimitGrid.setFirstSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setFirstSectionChooseMonthPaymentPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CSS));
        withDeviceNoLimitGrid.setFirstSectionChooseMonthPaymentPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CSS));
        withDeviceNoLimitGrid.setFirstSectionPrice(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_PRICE_CSS));
        withDeviceNoLimitGrid.setFirstSectionLeftPriceAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CSS));
        withDeviceNoLimitGrid.setFirstSectionRightPriceAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CSS));
        withDeviceNoLimitGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceNoLimitGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceNoLimitGrid.setFirstSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BONUS_INFORMATION_CSS));
        withDeviceNoLimitGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceNoLimitGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));

        withDeviceNoLimitGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceNoLimitGrid.setSecondSectionOfferHeaderPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_OFFER_HEADER_PT2_CSS));
        withDeviceNoLimitGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT1_CSS));
        withDeviceNoLimitGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT2_CSS));
        withDeviceNoLimitGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setSecondSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT1_CSS));
        withDeviceNoLimitGrid.setSecondSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT2_CSS));
        withDeviceNoLimitGrid.setSecondSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SMS_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setSecondSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT1_CSS));
        withDeviceNoLimitGrid.setSecondSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT2_CSS));
        withDeviceNoLimitGrid.setSecondSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setSecondSectionChooseMonthPaymentPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CSS));
        withDeviceNoLimitGrid.setSecondSectionChooseMonthPaymentPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CSS));
        withDeviceNoLimitGrid.setSecondSectionPrice(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_PRICE_CSS));
        withDeviceNoLimitGrid.setSecondSectionLeftPriceAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CSS));
        withDeviceNoLimitGrid.setSecondSectionRightPriceAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CSS));
        withDeviceNoLimitGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceNoLimitGrid.setSecondSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceNoLimitGrid.setSecondSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BONUS_INFORMATION_CSS));
        withDeviceNoLimitGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceNoLimitGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));

        withDeviceNoLimitGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CSS));
        withDeviceNoLimitGrid.setThirdSectionOfferHeaderPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_OFFER_HEADER_PT2_CSS));
        withDeviceNoLimitGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT1_CSS));
        withDeviceNoLimitGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT2_CSS));
        withDeviceNoLimitGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setThirdSectionSmsPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT1_CSS));
        withDeviceNoLimitGrid.setThirdSectionSmsPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT2_CSS));
        withDeviceNoLimitGrid.setThirdSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SMS_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setThirdSectionInternetPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT1_CSS));
        withDeviceNoLimitGrid.setThirdSectionInternetPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT2_CSS));
        withDeviceNoLimitGrid.setThirdSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CSS));
        withDeviceNoLimitGrid.setThirdSectionChooseMonthPaymentPT1(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CSS));
        withDeviceNoLimitGrid.setThirdSectionChooseMonthPaymentPT2(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CSS));
        withDeviceNoLimitGrid.setThirdSectionConstantPrice(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_CONSTANT_PRICE_CSS));
        withDeviceNoLimitGrid.setThirdSectionDynamicPrice(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_DYNAMIC_PRICE_CSS));
        withDeviceNoLimitGrid.setThirdSectionLeftPriceAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CSS));
        withDeviceNoLimitGrid.setThirdSectionRightPriceAdjustmentButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CSS));
        withDeviceNoLimitGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withDeviceNoLimitGrid.setThirdSectionPickPhoneButton(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_PICK_PHONE_BUTTON_CSS));
        withDeviceNoLimitGrid.setThirdSectionBonusInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BONUS_INFORMATION_CSS));
        withDeviceNoLimitGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withDeviceNoLimitGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));

    }

    @Override
    public PageInterface getPage() {
        return withDeviceNoLimitGrid;
    }
}
