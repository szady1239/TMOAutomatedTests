package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.WithDevice36MonthsGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.WithDevice36MonthsGrid;

public class WithDevice36MonthsGridBuilder implements PageBuilderInterface {
    WithDevice36MonthsGrid withDevice36MonthsGrid;

    @Override
    public void buildPage(WebDriver driver) {
        withDevice36MonthsGrid = new WithDevice36MonthsGrid();
        withDevice36MonthsGrid.setFirstSectionOfferHeaderPT1(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_OFFER_HEADER_PT1_CLASS));
        withDevice36MonthsGrid.setFirstSectionBillPaidPT1(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_BILL_PAID_PT1_CLASS));
        withDevice36MonthsGrid.setFirstSectionBillPaidPT2(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_BILL_PAID_PT2_CLASS));
        withDevice36MonthsGrid.setFirstSectionBillPaidTooltip(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_BILL_PAID_TOOLTIP_CLASS));
        withDevice36MonthsGrid.setFirstSectionSmsPT1(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_SMS_PT1_CLASS));
        withDevice36MonthsGrid.setFirstSectionSmsPT2(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_SMS_PT2_CLASS));
        withDevice36MonthsGrid.setFirstSectionSmsTooltip(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_SMS_TOOLTIP_CLASS));
        withDevice36MonthsGrid.setFirstSectionInternetPT1(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_INTERNET_PT1_CLASS));
        withDevice36MonthsGrid.setFirstSectionInternetPT2(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_INTERNET_PT2_CLASS));
        withDevice36MonthsGrid.setFirstSectionInternetTooltip(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_INTERNET_TOOLTIP_CLASS));
        withDevice36MonthsGrid.setFirstSectionChooseMonthPaymentPT1(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_CHOOSE_MONTH_PAYMENT_PT1_CLASS));
        withDevice36MonthsGrid.setFirstSectionChooseMonthPaymentPT2(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_CHOOSE_MONTH_PAYMENT_PT2_CLASS));
        withDevice36MonthsGrid.setFirstSectionPrice(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_PRICE_CLASS));
        withDevice36MonthsGrid.setFirstSectionLeftPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_LEFT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDevice36MonthsGrid.setFirstSectionRightPriceAdjustmentButton(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_RIGHT_PRICE_ADJUSTMENT_BUTTON_CLASS));
        withDevice36MonthsGrid.setFirstSectionSubscriptionLengthInformation(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_SUBSCRIPTION_LENGTH_INFORMATION_CLASS));
        withDevice36MonthsGrid.setFirstSectionPickPhoneButton(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_PICK_PHONE_BUTTON_CLASS));
        withDevice36MonthsGrid.setFirstSectionBonusInformation(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_BONUS_INFORMATION_CLASS));
        withDevice36MonthsGrid.setFirstSectionFreeShipmentInformation(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_FREE_SHIPMENT_INFORMATION_CLASS));
        withDevice36MonthsGrid.setFirstSectionDiscountForOnlineOrderInformation(WebUtils.getElementByClass(driver, WithDevice36MonthsGridLocators.FIRST_SECTION_DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_CLASS));

    }

    @Override
    public PageInterface getPage() {
        return withDevice36MonthsGrid;
    }
}
