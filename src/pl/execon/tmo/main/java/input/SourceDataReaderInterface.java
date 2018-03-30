package pl.execon.tmo.main.java.input;

import com.google.common.collect.ArrayListMultimap;

import java.io.IOException;
import java.util.List;

/**
 * Fasade to manage test case data's
 *
 * @author Pawel Lagodzinski
 * @author Mateusz Grajper
 * @since 2016-07-15
 * @version 1.0
 */
public interface SourceDataReaderInterface {

    /**
     * Get test case data as list. Each element of list contains information needed by another test run
     *
     * @param dataFilePath path where we can find test case data for selected test case
     * @param testCaseName name of test case
     * @return List of data used to execute test.
     * @see ArrayListMultimap
     */
    List<ArrayListMultimap<String, String>> readTestCaseData(String dataFilePath, String testCaseName);

    /**
     * Return list of testcases which should be executed
     *
     * @param dataFilePath path to information which test we should be executed
     * @return List of names of test case's to run
     * @throws IOException when can't get list of tc to execute
     */
    List<String> getTestCasesToRun(String dataFilePath) throws IOException;
}
