package pl.execon.tmo.main.java.testclasses;

import org.openqa.selenium.By;
import pl.execon.tmo.main.java.builders.HeaderBuilder;
import pl.execon.tmo.main.java.builders.WithDeviceNoLimitGridBuilder;
import pl.execon.tmo.main.java.utils.FormsHelper;
import pl.execon.tmo.main.java.utils.PageBuilderHelper;
import pl.execon.tmo.main.java.utils.PickPhoneHelper;
import pl.execon.tmo.main.java.webelements.Header;
import pl.execon.tmo.main.java.webelements.WithDeviceNoLimitGrid;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FullVoiceOrderProcessFromDevices {

    public static String CART_NEXT_BUTTON_CSS = "#proper-form-submit > p:nth-child(25) > input";
    public static String FORM_ALL_AGREEMENT_CONFIRM_CSS = "#panel-klient-indywidualny > section > div > div > div.normal-padding.no-padding-top > section > ul > li.select-all-check.font-size-medium.line-height-1.bold > div > label";
    public static String CONFIRM_FORM_BUTTON_CSS = "#basket-step-1 > div.align-right.submit > p:nth-child(1) > input.btn.btn--small-much-wide.btn--inline.btn--pink";
    public static String CONFIRM_FIRST_STEP_CSS = "#basket-documents > div.align-right > input.btn.btn--small-much-wide.btn--inline.btn--pink";
    public static void checkFullVoiceOrderProcessWithPhone(TestManager testManager) {
        Header header = PageBuilderHelper.generatePage(testManager, new HeaderBuilder(), false, false);
        header.getDevicesMenu().click();
        header.getPhonesSubMenu().click();

        PickPhoneHelper.getRandomDisplayedGetOfferButton(testManager.driver, PickPhoneHelper.getAllGetOfferButtons(testManager.driver, PickPhoneHelper.ALL_PHONES_FOR_CHOOSE_SUBSCRIPTION_CSS)).click();
        WithDeviceNoLimitGrid withDeviceNoLimitGrid = PageBuilderHelper.generatePage(testManager, new WithDeviceNoLimitGridBuilder(), true, false);
        withDeviceNoLimitGrid.getFirstSectionPickPhoneButton().click();

        testManager.driver.findElement(By.cssSelector(CART_NEXT_BUTTON_CSS)).click();
        FormsHelper.insertDataToForm(testManager);
        testManager.driver.findElement(By.cssSelector(FORM_ALL_AGREEMENT_CONFIRM_CSS)).click();
        testManager.driver.findElement(By.cssSelector(CONFIRM_FORM_BUTTON_CSS)).click();
        testManager.driver.findElement(By.cssSelector(CONFIRM_FIRST_STEP_CSS)).click();
        assertThat(testManager.driver.getTitle().equalsIgnoreCase("Podsumowanie"));
    }

    public static void insertDataToForm(TestManager testManager) {
        String[] firstSectionData = {"TestImie", "TestNazwisko", "18072101183", "AFU507966"};
        WebUtils.getElementByCSS(testManager.driver, "#field-1").sendKeys(firstSectionData[0]);
        WebUtils.getElementByCSS(testManager.driver, "#field-2").sendKeys(firstSectionData[1]);
        WebUtils.getElementByCSS(testManager.driver, "#field-3").sendKeys(firstSectionData[2]);
        WebUtils.getElementByCSS(testManager.driver, "#field-4").sendKeys(firstSectionData[3]);
        String[] secondSectionData = {"TestUlica", "123", "1", "00-100", "TestWarszawa", "669610208", "pawel.kowalczyk@execon.pl", "12345678"};
        WebUtils.getElementByCSS(testManager.driver, "#field-11").sendKeys(secondSectionData[0]);
        WebUtils.getElementByCSS(testManager.driver, "#field-12").sendKeys(secondSectionData[1]);
        WebUtils.getElementByCSS(testManager.driver, "#field-13").sendKeys(secondSectionData[2]);
        WebUtils.getElementByCSS(testManager.driver, "#field-10").sendKeys(secondSectionData[3]);
        WebUtils.getElementByCSS(testManager.driver, "#field-9").sendKeys(secondSectionData[4]);
        WebUtils.getElementByCSS(testManager.driver, "#field-6").sendKeys(secondSectionData[5]);
        WebUtils.getElementByCSS(testManager.driver, "#field-7").sendKeys(secondSectionData[6]);
        WebUtils.getElementByCSS(testManager.driver, "#field-8").sendKeys(secondSectionData[6]);
        WebUtils.getElementByCSS(testManager.driver, "#field-5").sendKeys(secondSectionData[7]);

    }
}
