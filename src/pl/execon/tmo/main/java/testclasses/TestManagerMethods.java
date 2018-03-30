package pl.execon.tmo.main.java.testclasses;

/**
 * Created by Pawel Lagodzinski on 2016-07-21.
 */
public class TestManagerMethods implements TestManagerMethodsInterface {

    private TestManager testManager;

    public TestManagerMethods(TestManager testManager) {
        this.testManager = testManager;
    }

    @Override
    public void beforeSuite() {
        // NOT USED IN THIS CASE
    }

    @Override
    public void afterSuite() {
        // NOT USED IN THIS CASE
    }

    @Override
    public void afterMethod() {
        // NOT USED IN THIS CASE
    }
}
