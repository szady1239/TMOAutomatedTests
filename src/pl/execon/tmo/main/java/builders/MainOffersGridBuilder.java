package pl.execon.tmo.main.java.builders;

import org.openqa.selenium.WebDriver;
import pl.execon.tmo.main.java.locators.MainOffersGridLocators;
import pl.execon.tmo.main.java.testclasses.WebUtils;
import pl.execon.tmo.main.java.webelements.MainOffersGrid;

public class MainOffersGridBuilder implements PageBuilderInterface {
    private MainOffersGrid page;

    @Override
    public void buildPage(WebDriver driver) {
        page = new MainOffersGrid();
        page.setHeader(WebUtils.getElementByClass(driver, MainOffersGridLocators.HEADER_CLASS));
        page.setWithDevice(WebUtils.getElementByClass(driver, MainOffersGridLocators.WITH_DEVICE_CLASS));
        page.setWithoutDevice(WebUtils.getElementByClass(driver, MainOffersGridLocators.WITHOUT_DEVICE_CLASS));
        page.setInNextStepChooseInfo(WebUtils.getElementByClass(driver, MainOffersGridLocators.IN_NEXT_STEP_CHOOSE_INFO_CLASS));
        page.setCommercialInformationText(WebUtils.getElementByClass(driver, MainOffersGridLocators.COMMERCIAL_INFORMATION_TEXT_CLASS));
        page.setDocumentsForDownloadDropdown(WebUtils.getElementByClass(driver, MainOffersGridLocators.DOCUMENTS_FOR_DOWNLOAD_DROPDOWN_CLASS));
    }

    @Override
    public PageInterface getPage() {
        return page;
    }
}
