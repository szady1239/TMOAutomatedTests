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

        withDeviceNoLimitGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceNoLimitGrid.setFirstSectionOfferHeaderPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_OFFER_HEADER_PT2_CLASS));
        withDeviceNoLimitGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceNoLimitGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceNoLimitGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withDeviceNoLimitGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withDeviceNoLimitGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withDeviceNoLimitGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withDeviceNoLimitGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setFirstSectionChooseMonthPaymentPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CLASS));
        withDeviceNoLimitGrid.setFirstSectionChooseMonthPaymentPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CLASS));
        withDeviceNoLimitGrid.setFirstSectionPrice(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_PRICE_CLASS));
        withDeviceNoLimitGrid.setFirstSectionLeftPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDeviceNoLimitGrid.setFirstSectionRightPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDeviceNoLimitGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceNoLimitGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

        withDeviceNoLimitGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceNoLimitGrid.setSecondSectionOfferHeaderPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_OFFER_HEADER_PT2_CLASS));
        withDeviceNoLimitGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceNoLimitGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceNoLimitGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setSecondSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT1_CLASS));
        withDeviceNoLimitGrid.setSecondSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT2_CLASS));
        withDeviceNoLimitGrid.setSecondSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setSecondSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT1_CLASS));
        withDeviceNoLimitGrid.setSecondSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT2_CLASS));
        withDeviceNoLimitGrid.setSecondSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setSecondSectionChooseMonthPaymentPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CLASS));
        withDeviceNoLimitGrid.setSecondSectionChooseMonthPaymentPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CLASS));
        withDeviceNoLimitGrid.setSecondSectionPrice(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_PRICE_CLASS));
        withDeviceNoLimitGrid.setSecondSectionLeftPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDeviceNoLimitGrid.setSecondSectionRightPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDeviceNoLimitGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setSecondSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceNoLimitGrid.setSecondSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

        withDeviceNoLimitGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CLASS));
        withDeviceNoLimitGrid.setThirdSectionOfferHeaderPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_OFFER_HEADER_PT2_CLASS));
        withDeviceNoLimitGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT1_CLASS));
        withDeviceNoLimitGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT2_CLASS));
        withDeviceNoLimitGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setThirdSectionSmsPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT1_CLASS));
        withDeviceNoLimitGrid.setThirdSectionSmsPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT2_CLASS));
        withDeviceNoLimitGrid.setThirdSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SMS_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setThirdSectionInternetPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT1_CLASS));
        withDeviceNoLimitGrid.setThirdSectionInternetPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT2_CLASS));
        withDeviceNoLimitGrid.setThirdSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CLASS));
        withDeviceNoLimitGrid.setThirdSectionChooseMonthPaymentPT1(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CLASS));
        withDeviceNoLimitGrid.setThirdSectionChooseMonthPaymentPT2(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CLASS));
        withDeviceNoLimitGrid.setThirdSectionConstantPrice(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_CONSTANT_PRICE_CLASS));
        withDeviceNoLimitGrid.setThirdSectionDynamicPrice(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_DYNAMIC_PRICE_CLASS));
        withDeviceNoLimitGrid.setThirdSectionLeftPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDeviceNoLimitGrid.setThirdSectionRightPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDeviceNoLimitGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setThirdSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDeviceNoLimitGrid.setThirdSectionBonusInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_BONUS_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDeviceNoLimitGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDeviceNoLimitGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

    }

    @Override
    public PageInterface getPage() {
        return withDeviceNoLimitGrid;
    }
}
