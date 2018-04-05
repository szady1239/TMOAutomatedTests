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
        page.setHeader(WebUtils.getElementByCSS(driver, MainOffersGridLocators.HEADER_CSS));
        page.setWithDevice(WebUtils.getElementByCSS(driver, MainOffersGridLocators.WITH_DEVICE_CSS));
        page.setWithoutDevice(WebUtils.getElementByCSS(driver, MainOffersGridLocators.WITHOUT_DEVICE_CSS));
        page.setInNextStepChooseInfo(WebUtils.getElementByCSS(driver, MainOffersGridLocators.IN_NEXT_STEP_CHOOSE_INFO_CSS));
        page.setCommercialInformationText(WebUtils.getElementByCSS(driver, MainOffersGridLocators.COMMERCIAL_INFORMATION_TEXT_CSS));
        page.setDocumentsForDownloadDropdown(WebUtils.getElementByCSS(driver, MainOffersGridLocators.DOCUMENTS_FOR_DOWNLOAD_DROPDOWN_CSS));
    }

    @Override
    public PageInterface getPage() {
        return page;
    }
}
