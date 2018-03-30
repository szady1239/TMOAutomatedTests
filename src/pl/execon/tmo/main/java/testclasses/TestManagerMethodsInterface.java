package pl.execon.tmo.main.java.testclasses;

/**
 * Class used to inject logic to methods (marked with Selenium annotations) used in TestManager
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-21
 * @version 1.0
 * @see TestManager
 */
public interface TestManagerMethodsInterface {

    /**
     * Method injected to beforeSuite method in TestManager
     */
    void beforeSuite();

    /**
     * Method injected to afterSuite method in TestManager
     */
    void afterSuite();

    /**
     * Method injected to afterMehod method in TestManager
     *
     */
    void afterMethod();

}
