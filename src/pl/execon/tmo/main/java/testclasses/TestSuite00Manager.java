package pl.execon.tmo.main.java.testclasses;

import java.io.IOException;


public class TestSuite00Manager extends TestManager {

    private static final String TEST_SUITE_NAME = "TS00";
    private static final Integer SET_ONE = 1;
    private static final Integer SET_TWO = 2;
    private static final Integer SET_THREE = 3;
    private static final Integer SET_FOUR = 4;
    private static final Integer SET_FIVE = 5;
    private static final Integer SET_SIX = 6;
    private static final Integer SET_SEVEN = 7;
    private static final Integer SET_EIGHT = 8;
    private static final Integer SET_NINE = 9;

    private static final String TC_ONE = "TC01";
    private static final String TC_TWO = "TC02";
    private static final String TC_THREE = "TC03";
    private static final String TC_FOUR = "TC04";
    private static final String TC_FIVE = "TC05";
    private static final String TC_SIX = "TC06";
    private static final String TC_SEVEN = "TC07";
    private static final String TC_EIGHT = "TC08";
    private static final String TC_NINE = "TC09";
    private static final String TC_TEN = "TC10";
    private static final String TC_ELEVEN = "TC11";

    public TestSuite00Manager() {
        super(TEST_SUITE_NAME);
        setManagerMethods(new TestManagerMethods(this));
    }

    /**
     * @return Empty table if test case should not be executed or table with user and import data if
     * test case should be executed
     * @throws IOException
     */


}
