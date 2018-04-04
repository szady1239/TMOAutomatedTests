package pl.execon.tmo.main.java.testclasses;

import java.io.IOException;


public class TestSuite00Manager extends TestManager {

    private static final String TEST_SUITE_NAME = "TS00";

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
