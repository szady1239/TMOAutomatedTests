package pl.execon.tmo.main.java.data;

import com.google.common.collect.ArrayListMultimap;

import java.util.List;
import java.util.Map;

public class TestSuiteData {
    private String tsName;

    /**
     * <tcName , <set, queryDataObject>
     */

    private ArrayListMultimap<String, Map<Integer, List<OrderInfo>>> tcData;


    public TestSuiteData(String tsName) {
        this.tsName = tsName;
        tcData = ArrayListMultimap.create();
    }

    public String getTsName() {
        return tsName;
    }


    public void addData(ArrayListMultimap<String, Map<Integer, List<OrderInfo>>> tcData) {
        this.tcData = tcData;
    }

    /**
     * Get specified data object
     *
     * @param tcName name of test case
     * @param set    number of data set
     * @return orderInfo object or null
     */
    public List<OrderInfo> getData(String tcName, Integer set) {
        try {
            // TC can have many data sets so get all of them
            List<Map<Integer, List<OrderInfo>>> data = tcData.get(tcName);
            // now get data set specified in method parameter
            for (Map<Integer, List<OrderInfo>> entry : data) {
                if (entry.containsKey(set)) {
                    return entry.get(set);
                }
            }
        } catch (NullPointerException ex) {
            System.out.println("No data object for TC: " + tcName + " set: " + set);
            System.out.println(ex.getMessage());
        }
        return null;
    }

    /**
     * Method used to return all TS query objects
     *
     * @return <tcName, <data_set_number, query_object>>
     */

    /**
     * Method used to return all TS data (mapped TC data and it's sets)
     *
     * @return <tcName, <data_set_number, list of order objects>>
     */
    public ArrayListMultimap<String, Map<Integer, List<OrderInfo>>> getTcData() {
        return tcData;
    }


    @Override
    public String toString() {
        return "TestSuiteData{" +
                "tsName='" + tsName + '\'' +
                ", tcData=" + tcData +
                '}';
    }
}
