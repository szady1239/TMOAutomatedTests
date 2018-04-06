package pl.execon.tmo.main.java.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pl.execon.tmo.main.java.testclasses.TestManager;

public class CloseUnnecesaryDivs {
    private static final String COOKIES_CONFIRM_BUTTON_CSS = "#cookies > div > div > div.buttonContent > button";
    private static final String NOTIFICATION_POPUP_BLOCK_BUTTON_CSS = "#pushpushgo-container > div.ppg__signin--native > div > div.ppg__signin-buttons > a:nth-child(1)";
    private static final String CHAT_DIV_REMOVE_SCRIPT = "$('#cp-chat-button').remove()";

    public static void closeUnnecesaryDivs(TestManager testManager){
        testManager.getWebDriver().findElement(By.cssSelector(COOKIES_CONFIRM_BUTTON_CSS)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testManager.getWebDriver().findElement(By.cssSelector(NOTIFICATION_POPUP_BLOCK_BUTTON_CSS)).click();
    }

    public static void closeChatDiv(TestManager testManager){
        JavascriptExecutor js = (JavascriptExecutor) testManager.getWebDriver();
        js.executeScript(CHAT_DIV_REMOVE_SCRIPT);
    }
}
