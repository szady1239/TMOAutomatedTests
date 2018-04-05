package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithoutDeviceNoLimitGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithoutDeviceNoLimitGrid;

public class WithoutDeviceNoLimitGridBuilder implements PageBuilderInterface {
    WithoutDeviceNoLimitGrid withoutDeviceNoLimitGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withoutDeviceNoLimitGrid = new WithoutDeviceNoLimitGrid();
        withoutDeviceNoLimitGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT1_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT2_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT1_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT2_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionPrice(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_PRICE_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));

        withoutDeviceNoLimitGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT1_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT2_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT1_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT2_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionConstantPrice(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_CONSTANT_PRICE_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionDynamicPrice(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_DYNAMIC_PRICE_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));

        withoutDeviceNoLimitGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT1_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT2_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionSmsPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT1_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionSmsPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT2_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionSmsTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SMS_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionInternetPT1(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT1_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionInternetPT2(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT2_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionInternetTooltip(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionPrice(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_PRICE_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionToCartButton(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_TO_CART_BUTTON_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionBonusInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BONUS_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CSS));
        withoutDeviceNoLimitGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByCSS(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CSS));

    }

    @Override
    public PageInterface getPage() {
        return withoutDeviceNoLimitGrid;
    }
}
