package pl.execon.tmo.main.java.utils;

import pl.execon.tmo.main.java.testclasses.TestManager;
import pl.execon.tmo.main.java.testclasses.WebUtils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FormsHelper {

    public static void insertDataToForm(TestManager testManager) {
        Properties prop = new Properties();
        FileReader reader = null;
        try {
            reader = new FileReader("./src/main/resources/properties.properties");
            prop.load(reader);
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.info(prop.getProperty("imie"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-1").sendKeys(prop.getProperty("imie"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-2").sendKeys(prop.getProperty("nazwisko"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-3").sendKeys(prop.getProperty("pesel"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-4").sendKeys(prop.getProperty("dowod"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-11").sendKeys(prop.getProperty("ulica"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-12").sendKeys(prop.getProperty("nrdomu"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-13").sendKeys(prop.getProperty("nrmieszkania"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-10").sendKeys(prop.getProperty("kodpocztowy"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-9").sendKeys(prop.getProperty("miejscowosc"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-6").sendKeys(prop.getProperty("telefon"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-7").sendKeys(prop.getProperty("email"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-8").sendKeys(prop.getProperty("email"));
        WebUtils.getElementByCSS(testManager.getWebDriver(), "#field-5").sendKeys(prop.getProperty("haslo"));

    }
}
