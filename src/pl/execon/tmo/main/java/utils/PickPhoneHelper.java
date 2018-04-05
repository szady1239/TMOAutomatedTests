package pl.execon.tmo.main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PickPhoneHelper {
    public static String ALL_PHONES_FOR_CHOOSEN_SUBSCRIPTION_CSS = "input[value=\"Do koszyka\"]";
    public static String ALL_PHONES_FOR_CHOOSE_SUBSCRIPTION_CSS = "a[title=\" Dobierz ofertę\"]";

    public static List<WebElement> getAllGetOfferButtons(WebDriver driver, String cssSelector) {
        return driver.findElements(By.cssSelector(cssSelector));
    }

    public static WebElement getRandomDisplayedGetOfferButton(WebDriver driver, List<WebElement> list) {
        List<WebElement> toRemove = new ArrayList<>();

        for (WebElement temp : list) {
            if (!temp.isDisplayed()) {
                toRemove.add(temp);
            }
        }
        list.removeAll(toRemove);

        Random rand = new Random();
        Assert.assertFalse(list.isEmpty());
        int i = rand.nextInt(list.size());

        return list.get(i);
    }

}
