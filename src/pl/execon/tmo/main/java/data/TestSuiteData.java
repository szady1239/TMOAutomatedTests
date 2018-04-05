package pl.execon.tmo.main.java.data;

import com.google.common.collect.ArrayListMultimap;

import java.util.List;
import java.util.Map;

public class TestSuiteData {
    private String tsName;

    /**
     * <tcName , <set, queryDataObject>
     */

    public String getTsName() {
        return tsName;
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
    @Override
    public String toString() {
        return "TestSuiteData{" +
                "tsName='" + tsName + '\'' +
                ", tcData=" +
                '}';
    }
}
