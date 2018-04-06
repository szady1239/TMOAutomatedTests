package pl.execon.tmo.main.java.testclasses;

import org.openqa.selenium.By;
import pl.execon.tmo.main.java.builders.HeaderBuilder;
import pl.execon.tmo.main.java.builders.MainOffersGridBuilder;
import pl.execon.tmo.main.java.builders.WithDeviceContractMenuBuilder;
import pl.execon.tmo.main.java.builders.WithoutDeviceContractMenuBuilder;
import pl.execon.tmo.main.java.utils.AssertionHelper;
import pl.execon.tmo.main.java.utils.CloseUnnecesaryDivs;
import pl.execon.tmo.main.java.utils.PageBuilderHelper;
import pl.execon.tmo.main.java.webelements.Header;
import pl.execon.tmo.main.java.webelements.MainOffersGrid;
import pl.execon.tmo.main.java.webelements.WithDeviceContractMenu;
import pl.execon.tmo.main.java.webelements.WithoutDeviceContractMenu;

public class CheckAllGridsStartedFromOffers {

    public static void checkAllGrids(TestManager testManager) {
        CloseUnnecesaryDivs.closeUnnecesaryDivs(testManager);
        Header header = PageBuilderHelper.generatePage(testManager, new HeaderBuilder(), false, false);
        header.getOffersMenu().click();
        header.getSubscriptionSubMenu().click();
        MainOffersGrid mainOffersGrid = PageBuilderHelper.generatePage(testManager, new MainOffersGridBuilder(), true, false);
        WithDeviceContractMenu withDeviceContractMenu = PageBuilderHelper.generatePage(testManager, new WithDeviceContractMenuBuilder(), true, false);

        CloseUnnecesaryDivs.closeChatDiv(testManager);
        withDeviceContractMenu.getTMobileNoLimit().click();
        AssertionHelper.checkBaseAssertionsNoLimitWithDevice(testManager);

        withDeviceContractMenu.getThreeYearSubscription().click();
        AssertionHelper.checkBaseAssertionsThreeYearSubscription(testManager);

        withDeviceContractMenu.getStandard().click();
        AssertionHelper.checkBaseAssertionsStandardWithDevice(testManager);

        withDeviceContractMenu.getForNumberTransfer().click();
        AssertionHelper.checkBaseAssertionsForNumberTransfer(testManager);

        mainOffersGrid.getWithoutDevice().click();
        WithoutDeviceContractMenu withoutDeviceContractMenu = PageBuilderHelper.generatePage(testManager, new WithoutDeviceContractMenuBuilder(), true, false);
        withoutDeviceContractMenu.getTMobileNoLimit().click();
        AssertionHelper.checkBaseAssertionsNoLimitWithoutDevice(testManager);

        withoutDeviceContractMenu.getStandard().click();
        AssertionHelper.checkBaseAssertionsStandardWithoutDevice(testManager);

        withoutDeviceContractMenu.getOnlineOnly().click();
        AssertionHelper.checkBaseAssertionsOnlineOnly(testManager);
    }


}
