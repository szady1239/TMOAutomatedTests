package pl.execon.tmo.main.java.utils;

import org.openqa.selenium.By;
import pl.execon.tmo.main.java.builders.*;
import pl.execon.tmo.main.java.data.OfferData;
import pl.execon.tmo.main.java.testclasses.TestManager;
import pl.execon.tmo.main.java.webelements.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AssertionHelper {

    private static final String PAY_BILL_HEADER = "ROZMOWY NA NUMERY\nKOMÓRKOWE I STACJONARNE";
    private static final String NO_LIMIT_TEXT = "BEZ LIMITU";
    private static final String POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO = "W Polsce oraz w roamingu w UE";
    private static final String POLAND_AND_EUROPE_TOOLTIP_INFO = "W Polsce oraz UE";
    private static final String SMS_HEADER = "SMS-Y i MMS-Y";
    private static final String INTERNET_HEADER = "INTERNET";
    private static final String SUPERNET_HEADER = "SUPERNET";
    private static final String NO_DATA_LIMIT_TEXT = "BEZ LIMITU DANYCH";
    private static final String INTERNET_TOOLTIP_INFO_39GB = "W tym 3,9 GB w UE";
    private static final String SUBSCRIPTION_STANDARD_LENGTH = "Umowa na 24 miesiące";
    private static final String BONUS_HEADER = "BONUSY";
    private static final String FREE_SHIPMENT_INFO = "Darmowa\ndostawa";
    private static final String DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO = "Rabat za\nzakupy online";
    private static final String SUBSCRIPTION_EXTENDED_LENGTH = "Zobowiązanie na 36 miesięcy";
    private static final String SUBSCRIPTION_EXTENDED_TOOLTIP_INFO = "Umowa na abonament wynosi 24 miesiące, umowa na raty za sprzęt – 36 miesięcy";
    private static final String STANDARD_T1_SMS_COST = "20gr";
    private static final String STANDARD_T1_INTERNET_LIMIT = "2 GB";
    private static final String STANDARD_T2_INTERNET_LIMIT = "5 GB";
    private static final String INTERNET_TOOLTIP_INFO_155GB = "W tym 1,55 GB w UE";
    private static final String INTERNET_TOOLTIP_INFO_255GB = "W tym 2,55 GB w UE";
    private static final String INTERNET_TOOLTIP_INFO_36GB = "W tym 3,6 GB w UE";
    private static final String CHOOSE_IN_NEXT_STEP_INFO = "WYBIERZ W DALSZYM KROKU";
    private static final String SUBSCRIPTION_DEMO_LENGTH = "Umowa na 6 miesięcy";
    private static final String CART_PRICE_CSS = "#basket-summary > div > div > div.col.col-path-price_sm-3_xs-6.border-right-dashed > div.path-summary__content.align-center > div > div > div > span.price__amount";
    private static final String SUMMARY_OFFER_PRICE_CSS = "#content > div > div > div.grid.grid-bigGutter > div.col-4_sm-6_xs-12 > div > div.row.with-accordion > div > div.clearfix > div.pull-right.price-big.price > div > div > span.price__amount";
    private static final String SUMMARY_OFFER_PRICE_WITH_PHONE_CSS = "#content > div > div > div.grid.grid-bigGutter > div.col-4_sm-6_xs-12 > div > div:nth-child(5) > div > div.clearfix > div.pull-right.price-big.price > div > div > span.price__amount";
    public static void checkOfferPriceAssertionOnCartPage(TestManager testManager, OfferData offerData){
        String priceFromGrid = offerData.getOfferPrice().replace(" zł","");
        String priceFromCart = testManager.getWebDriver().findElement(By.cssSelector(CART_PRICE_CSS)).getText().replace(".", "");
        assertThat(priceFromGrid).containsIgnoringCase(priceFromCart);
    }

    public static void checkOfferPriceAssertionOnSummaryPageWithoutPhone(TestManager testManager, OfferData offerData) {
        String priceFromGrid = offerData.getOfferPrice().replace(" zł","");
        String priceFromSummary = testManager.getWebDriver().findElement(By.cssSelector(SUMMARY_OFFER_PRICE_CSS)).getText().replace(".", "");
        assertThat(priceFromGrid).containsIgnoringCase(priceFromSummary);
    }

    public static void checkOfferPriceAssertionOnSummaryPageWithPhone(TestManager testManager, OfferData offerData) {
        String priceFromGrid = offerData.getOfferPrice().replace(" zł","");
        String priceFromSummary = testManager.getWebDriver().findElement(By.cssSelector(SUMMARY_OFFER_PRICE_WITH_PHONE_CSS)).getText().replace(".", "");
        assertThat(priceFromGrid).containsIgnoringCase(priceFromSummary);
    }



    public static void checkBaseAssertionsStandardWithDevice(TestManager testManager) {
        WithDeviceStandardGrid withDeviceStandardGrid = PageBuilderHelper.generatePage(testManager, new WithDeviceStandardGridBuilder(), true, false);

        assertThat(withDeviceStandardGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T1");
        assertThat(withDeviceStandardGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceStandardGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceStandardGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceStandardGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceStandardGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(STANDARD_T1_SMS_COST);
        assertThat(withDeviceStandardGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceStandardGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        //assertThat(withDeviceStandardGrid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T1_INTERNET_LIMIT);
        assertThat(withDeviceStandardGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_155GB);
        assertThat(withDeviceStandardGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceStandardGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceStandardGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceStandardGrid.getFirstSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
        assertThat(withDeviceStandardGrid.getFirstSectionVideoPT1().getText()).containsIgnoringCase(CHOOSE_IN_NEXT_STEP_INFO);

        assertThat(withDeviceStandardGrid.getSecondSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T2");
        assertThat(withDeviceStandardGrid.getSecondSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceStandardGrid.getSecondSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceStandardGrid.getSecondSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceStandardGrid.getSecondSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceStandardGrid.getSecondSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceStandardGrid.getSecondSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceStandardGrid.getSecondSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        //assertThat(withDeviceStandardGrid.getSecondSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T2_INTERNET_LIMIT);
        assertThat(withDeviceStandardGrid.getSecondSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_255GB);
        assertThat(withDeviceStandardGrid.getSecondSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceStandardGrid.getSecondSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceStandardGrid.getSecondSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceStandardGrid.getSecondSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
        assertThat(withDeviceStandardGrid.getSecondSectionVideoPT1().getText()).containsIgnoringCase(CHOOSE_IN_NEXT_STEP_INFO);

        assertThat(withDeviceStandardGrid.getThirdSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T2 - SMARTFONERIA");
        assertThat(withDeviceStandardGrid.getThirdSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceStandardGrid.getThirdSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceStandardGrid.getThirdSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceStandardGrid.getThirdSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceStandardGrid.getThirdSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceStandardGrid.getThirdSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceStandardGrid.getThirdSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        assertThat(withDeviceStandardGrid.getThirdSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withDeviceStandardGrid.getThirdSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_36GB);
        assertThat(withDeviceStandardGrid.getThirdSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceStandardGrid.getThirdSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceStandardGrid.getThirdSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceStandardGrid.getThirdSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
        assertThat(withDeviceStandardGrid.getThirdSectionVideoPT1().getText()).containsIgnoringCase(CHOOSE_IN_NEXT_STEP_INFO);
    }

    public static void checkBaseAssertionsStandardWithoutDevice(TestManager testManager) {
        WithoutDeviceStandardGrid withoutDeviceStandardGrid = PageBuilderHelper.generatePage(testManager, new WithoutDeviceStandardGridBuilder(), true, false);

        assertThat(withoutDeviceStandardGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T1");
        assertThat(withoutDeviceStandardGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceStandardGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceStandardGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceStandardGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceStandardGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(STANDARD_T1_SMS_COST);
        assertThat(withoutDeviceStandardGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceStandardGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        //assertThat(withoutDeviceNoLimitGrid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T1_INTERNET_LIMIT);
        assertThat(withoutDeviceStandardGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_155GB);
        assertThat(withoutDeviceStandardGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withoutDeviceStandardGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceStandardGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withoutDeviceStandardGrid.getFirstSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withoutDeviceStandardGrid.getSecondSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T2");
        assertThat(withoutDeviceStandardGrid.getSecondSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceStandardGrid.getSecondSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceStandardGrid.getSecondSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceStandardGrid.getSecondSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceStandardGrid.getSecondSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceStandardGrid.getSecondSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceStandardGrid.getSecondSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        //assertThat(withoutDeviceNoLimitGrid.getSecondSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T2_INTERNET_LIMIT);
        assertThat(withoutDeviceStandardGrid.getSecondSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_255GB);
        assertThat(withoutDeviceStandardGrid.getSecondSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withoutDeviceStandardGrid.getSecondSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceStandardGrid.getSecondSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withoutDeviceStandardGrid.getSecondSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
    }

    public static void checkBaseAssertionsForNumberTransfer(TestManager testManager) {
        WithDeviceForNumberTransfersGrid withDeviceForNumberTransfersGrid = PageBuilderHelper.generatePage(testManager, new WithDeviceForNumberTransferGridBuilder(), true, false);

        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T1");
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(STANDARD_T1_SMS_COST);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        //assertThawithDeviceForNumberTransfersGridid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T1_INTERNET_LIMIT);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_155GB);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getFirstSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T2");
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        //assertThawithDeviceForNumberTransfersGridid.getSecondSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T2_INTERNET_LIMIT);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_255GB);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getSecondSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionOfferHeaderPT1().getText()).containsIgnoringCase("OFERTA T2 - SMARTFONERIA");
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionInternetPT1().getText()).containsIgnoringCase(SUPERNET_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_36GB);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceForNumberTransfersGrid.getThirdSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
    }

    public static void checkBaseAssertionsNoLimitWithDevice(TestManager testManager) {
        WithDeviceNoLimitGrid withDeviceNoLimitGrid = PageBuilderHelper.generatePage(testManager, new WithDeviceNoLimitGridBuilder(), true, false);
        assertThat(withDeviceNoLimitGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("T-Mobile");
        assertThat(withDeviceNoLimitGrid.getFirstSectionOfferHeaderPT2().getText()).containsIgnoringCase("Bez limitu");
        assertThat(withDeviceNoLimitGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceNoLimitGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceNoLimitGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceNoLimitGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceNoLimitGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withDeviceNoLimitGrid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_39GB);
        //assertThat(withDeviceNoLimitGrid.getFirstSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThat(withDeviceNoLimitGrid.getFirstSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withDeviceNoLimitGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceNoLimitGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceNoLimitGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceNoLimitGrid.getFirstSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withDeviceNoLimitGrid.getSecondSectionOfferHeaderPT1().getText()).containsIgnoringCase("T-Mobile");
        assertThat(withDeviceNoLimitGrid.getSecondSectionOfferHeaderPT2().getText()).containsIgnoringCase("DLA PRZENOSZĄCYCH NUMER");
        assertThat(withDeviceNoLimitGrid.getSecondSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceNoLimitGrid.getSecondSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getSecondSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceNoLimitGrid.getSecondSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceNoLimitGrid.getSecondSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getSecondSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceNoLimitGrid.getSecondSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withDeviceNoLimitGrid.getSecondSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getSecondSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_39GB);
        //assertThat(withDeviceNoLimitGrid.getSecondSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThat(withDeviceNoLimitGrid.getSecondSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withDeviceNoLimitGrid.getSecondSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceNoLimitGrid.getSecondSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceNoLimitGrid.getSecondSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceNoLimitGrid.getSecondSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withDeviceNoLimitGrid.getThirdSectionOfferHeaderPT1().getText()).containsIgnoringCase("4 MIESIĄCE ZA 1 ZŁ");
        assertThat(withDeviceNoLimitGrid.getThirdSectionOfferHeaderPT2().getText()).containsIgnoringCase("DLA PRZENOSZĄCYCH NUMER");
        assertThat(withDeviceNoLimitGrid.getThirdSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDeviceNoLimitGrid.getThirdSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getThirdSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceNoLimitGrid.getThirdSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDeviceNoLimitGrid.getThirdSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getThirdSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withDeviceNoLimitGrid.getThirdSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withDeviceNoLimitGrid.getThirdSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withDeviceNoLimitGrid.getThirdSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_39GB);
        //assertThat(withDeviceNoLimitGrid.getThirdSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThat(withDeviceNoLimitGrid.getThirdSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withDeviceNoLimitGrid.getThirdSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withDeviceNoLimitGrid.getThirdSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDeviceNoLimitGrid.getThirdSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDeviceNoLimitGrid.getThirdSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
    }

    public static void checkBaseAssertionsNoLimitWithoutDevice(TestManager testManager) {
        WithoutDeviceNoLimitGrid withoutDeviceNoLimitGrid = PageBuilderHelper.generatePage(testManager, new WithoutDeviceNoLimitGridBuilder(), true, false);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("NOWY NUMER");
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_255GB);
        //assertThawithoutDeviceNoLimitGridid.getFirstSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThawithoutDeviceNoLimitGridid.getFirstSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withoutDeviceNoLimitGrid.getFirstSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withoutDeviceNoLimitGrid.getSecondSectionOfferHeaderPT1().getText()).containsIgnoringCase("DLA PRZENOSZĄCYCH NUMER");
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_255GB);
        //assertThawithoutDeviceNoLimitGridid.getSecondSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThawithoutDeviceNoLimitGridid.getSecondSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withoutDeviceNoLimitGrid.getSecondSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

        assertThat(withoutDeviceNoLimitGrid.getThirdSectionOfferHeaderPT1().getText()).containsIgnoringCase("DLA PRZENOSZĄCYCH NUMER");
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_255GB);
        //assertThawithoutDeviceNoLimitGridid.getThirdSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThawithoutDeviceNoLimitGridid.getThirdSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withoutDeviceNoLimitGrid.getThirdSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
    }

    public static void checkBaseAssertionsThreeYearSubscription(TestManager testManager) {
        WithDevice36MonthsGrid withDevice36MonthsGrid = PageBuilderHelper.generatePage(testManager, new WithDevice36MonthsGridBuilder(), true, false);
        assertThat(withDevice36MonthsGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("T-Mobile BEZ LIMITU");
        assertThat(withDevice36MonthsGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withDevice36MonthsGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDevice36MonthsGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_TOOLTIP_INFO);
        assertThat(withDevice36MonthsGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withDevice36MonthsGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withDevice36MonthsGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_TOOLTIP_INFO);
        assertThat(withDevice36MonthsGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withDevice36MonthsGrid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(NO_DATA_LIMIT_TEXT);
        assertThat(withDevice36MonthsGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_39GB);
        //assertThat(withDevice36MonthsGrid.getFirstSectionChooseMonthPaymentPT1().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_HEADER);
        //assertThat(withDevice36MonthsGrid.getFirstSectionChooseMonthPaymentPT2().getText()).containsIgnoringCase(CHOOSE_PAYMENT_METHOD_INFO);
        assertThat(withDevice36MonthsGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_EXTENDED_LENGTH);
        assertThat(withDevice36MonthsGrid.getFirstSectionSubscriptionLengthInformationTooltip().getAttribute("data-original-title")).containsIgnoringCase(SUBSCRIPTION_EXTENDED_TOOLTIP_INFO);
        assertThat(withDevice36MonthsGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withDevice36MonthsGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withDevice36MonthsGrid.getFirstSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);
    }


    public static void checkBaseAssertionsOnlineOnly(TestManager testManager) {
        WithoutDeviceOnlineOnlyGrid withoutDeviceOnlineOnlyGrid = PageBuilderHelper.generatePage(testManager, new WithoutDeviceOnlyOnlineGridBuilder(), true, false);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionOfferHeaderPT1().getText()).containsIgnoringCase("T1 na 6 miesięcy");
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T1_INTERNET_LIMIT);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_155GB);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_DEMO_LENGTH);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getFirstSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);


        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionOfferHeaderPT1().getText()).containsIgnoringCase("T1 na 24 miesiące");
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionBillPaidPT1().getText()).containsIgnoringCase(PAY_BILL_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionBillPaidPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionBillPaidTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionSmsPT1().getText()).containsIgnoringCase(SMS_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionSmsPT2().getText()).containsIgnoringCase(NO_LIMIT_TEXT);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionSmsTooltip().getAttribute("data-original-title")).containsIgnoringCase(POLAND_AND_EUROPE_ROAMING_TOOLTIP_INFO);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionInternetPT1().getText()).containsIgnoringCase(INTERNET_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionInternetPT2().getText()).containsIgnoringCase(STANDARD_T1_INTERNET_LIMIT);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionInternetTooltip().getAttribute("data-original-title")).containsIgnoringCase(INTERNET_TOOLTIP_INFO_155GB);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionSubscriptionLengthInformation().getText()).containsIgnoringCase(SUBSCRIPTION_STANDARD_LENGTH);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionBonusInformation().getText()).containsIgnoringCase(BONUS_HEADER);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionFreeShipmentInformation().getText()).containsIgnoringCase(FREE_SHIPMENT_INFO);
        assertThat(withoutDeviceOnlineOnlyGrid.getSecondSectionDiscountForOnlineOrderInformation().getText()).containsIgnoringCase(DISCOUNT_FOR_ONLINE_ORDER_INFORMATION_INFO);

    }


}
