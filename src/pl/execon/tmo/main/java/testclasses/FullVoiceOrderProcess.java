package pl.execon.tmo.main.java.testclasses;

import pl.execon.tmo.main.java.builders.HeaderBuilder;
import pl.execon.tmo.main.java.builders.MainOffersGridBuilder;
import pl.execon.tmo.main.java.builders.WithoutDeviceContractMenuBuilder;
import pl.execon.tmo.main.java.builders.WithoutDeviceNoLimitGridBuilder;
import pl.execon.tmo.main.java.utils.PageBuilderHelper;
import pl.execon.tmo.main.java.webelements.Header;
import pl.execon.tmo.main.java.webelements.MainOffersGrid;
import pl.execon.tmo.main.java.webelements.WithoutDeviceContractMenu;
import pl.execon.tmo.main.java.webelements.WithoutDeviceNoLimitGrid;

public class FullVoiceOrderProcess {
    public static void checkFullVoiceOrderProcessWithoutPhone(TestManager testManager) {
        Header header = PageBuilderHelper.generatePage(testManager, new HeaderBuilder(), false, false);
        header.getOffersMenu().click();
        header.getSubscriptionSubMenu().click();
        MainOffersGrid mainOffersGrid = PageBuilderHelper.generatePage(testManager, new MainOffersGridBuilder(), true, false);
        mainOffersGrid.getWithoutDevice().click();
        WithoutDeviceContractMenu withoutDeviceContractMenu = PageBuilderHelper.generatePage(testManager, new WithoutDeviceContractMenuBuilder(), false, false);
        withoutDeviceContractMenu.getTMobileNoLimit().click();
        WithoutDeviceNoLimitGrid withoutDeviceNoLimitGrid = PageBuilderHelper.generatePage(testManager, new WithoutDeviceNoLimitGridBuilder(), true, false);

        withoutDeviceNoLimitGrid.getFirstSectionToCartButton().click();
    }
}
