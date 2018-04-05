package pl.execon.tmo.main.java.utils;

import org.openqa.selenium.By;
import pl.execon.tmo.main.java.testclasses.TestManager;

public class CloseUnnecesaryDivs {
    public static void closeUnnecesaryDivs(TestManager testManager){
        testManager.getWebDriver().findElement(By.cssSelector("#cookies > div > div > div.buttonContent > button")).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        testManager.getWebDriver().findElement(By.cssSelector("#pushpushgo-container > div.ppg__signin--native > div > div.ppg__signin-buttons > a:nth-child(1)")).click();
    }
}
