package pl.execon.tmo.main.java.testclasses;

import org.testng.annotations.Test;
import pl.execon.tmo.main.java.builders.HeaderBuilder;
import pl.execon.tmo.main.java.utils.PageBuilderHelper;
import pl.execon.tmo.main.java.webelements.Header;

import java.io.IOException;


public class TestSuite00Manager extends TestManager {

    private static final String TEST_SUITE_NAME = "TS01";

    public TestSuite00Manager() {
        super(TEST_SUITE_NAME);
        setManagerMethods(new TestManagerMethods(this));
    }


    @Test
    public void test1(){
        CheckAllGridsStartedFromOffers.checkAllGrids(this);
    }

    @Test
    public void test2(){
        FullVoiceOrderProcess.checkFullVoiceOrderProcessWithoutPhone(this);
    }


}
