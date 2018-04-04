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
        withoutDeviceNoLimitGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionPrice(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_PRICE_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

        withoutDeviceNoLimitGrid.setSecondSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT1_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SMS_PT2_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionConstantPrice(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_CONSTANT_PRICE_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionDynamicPrice(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_DYNAMIC_PRICE_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setSecondSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.SECOND_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

        withoutDeviceNoLimitGrid.setThirdSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_OFFER_HEADER_PT1_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT1_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_PT2_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionSmsPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT1_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionSmsPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SMS_PT2_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionSmsTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SMS_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionInternetPT1(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT1_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionInternetPT2(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_PT2_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionInternetTooltip(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_INTERNET_TOOLTIP_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionPrice(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_PRICE_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionToCartButton(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_TO_CART_BUTTON_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionBonusInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_BONUS_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withoutDeviceNoLimitGrid.setThirdSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithoutDeviceNoLimitGridLocators.THIRD_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

    }

    @Override
    public PageInterface getPage() {
        return withoutDeviceNoLimitGrid;
    }
}
