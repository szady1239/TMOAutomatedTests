package pl.execon.tmo.main.java.utils;

import com.google.common.collect.ArrayListMultimap;
import pl.execon.tmo.main.java.data.TestSuiteData;
import pl.execon.tmo.main.java.input.SourceDataReaderInterface;

import java.io.IOException;
import java.util.List;

/**
 * Class used to manage test data
 *
 * @author Mateusz Grajper
 * @author Pawel Lagodzinski
 * @version 1.0
 * @since 29 kwi 2016
 */
public class TestDataManager {

    private static TestDataManager testDataManager = null;
    private List<ArrayListMultimap<String, String>> dataMaps;
    private String lastTestCaseName;
    private String lastDataFilePath;
    private SourceDataReaderInterface sourceDataReader;
    private List<TestSuiteData> testSuiteDataList;

    private TestDataManager() {

    }

    /**
     * Method to get an instance of this object as an singleton.
     *
     * @return Instance of this class.
     */
    public synchronized static TestDataManager getInstance() {
        if (testDataManager == null) {
            testDataManager = new TestDataManager();
        }
        return testDataManager;
    }

    public void setSourceDataReader(SourceDataReaderInterface sourceDataReader) {
        this.sourceDataReader = sourceDataReader;
    }

    /**
     * Method to read source data
     *
     * @param dataFilePath path to source data
     * @param testCaseName name of test case
     */
    public void readSource(String dataFilePath, String testCaseName) {
        if (!testCaseName.equalsIgnoreCase(this.lastTestCaseName)
                || !dataFilePath.equalsIgnoreCase(lastDataFilePath)) {
            this.lastTestCaseName = testCaseName;
            this.lastDataFilePath = dataFilePath;
            dataMaps = sourceDataReader.readTestCaseData(dataFilePath, testCaseName);
        }
    }

    /**
     * Get last readed test case data
     *
     * @return list of test case data
     */

    public List<ArrayListMultimap<String, String>> getDataMaps() {
        return dataMaps;
    }

    /**
     * Get list of test case to run
     *
     * @param dataFilePath path to place where we can find information which test cases should be run
     * @return list of test cases to run
     * @throws IOException when can't set which tests should be run
     */

    public List<String> getTcToRun(String dataFilePath) throws IOException {
        return sourceDataReader.getTestCasesToRun(dataFilePath);
    }


    /**
     * Method to retrieve data sets number.
     *
     * @return Number of data sets.
     */
    public int getDataSetsNumber() {
        return dataMaps.size();
    }


    public List<OrderInfo> getSetOfTcData(String tsName, String tcName, Integer set) {
        List<OrderInfo> result = null;
        if (testSuiteDataList != null) {
            for (TestSuiteData entry : testSuiteDataList) {
                if (entry.getTsName().equals(tsName)) {
                    result = entry.getData(tcName, set);
                }
            }
        } else {
            Log.info("Test suite data list is empty");
        }
        return result;
    }
}
