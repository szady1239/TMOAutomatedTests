package pl.execon.tmo.main.java.testclasses;

import org.testng.annotations.Test;


public class TestSuite00Manager extends TestManager {

    private static final String TEST_SUITE_NAME = "TS01";

    public TestSuite00Manager() {
        super(TEST_SUITE_NAME);
        setManagerMethods(new TestManagerMethods(this));
    }


    @Test
    public void test1() {
        CheckAllGridsStartedFromOffers.checkAllGrids(this);
    }

    @Test
    public void test2() {
        FullVoiceOrderProcessFromOffersGrid.checkFullVoiceOrderProcessWithoutPhone(this);
    }

//    @Test
//    public void test3() {
//        FullVoiceOrderProcessFromOffersGrid.checkFullVoiceOrderProcessWithPhone(this);
//    }
//
//    @Test
//    public void test4() {
//        FullVoiceOrderProcessFromDevices.checkFullVoiceOrderProcessWithPhone(this);
//    }


}
