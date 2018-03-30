package pl.execon.tmo.main.java;

import org.testng.ITestNGListener;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;
import pl.execon.tmo.main.java.configuration.RunProfile;
import pl.execon.tmo.main.java.data.Configuration;
import pl.execon.tmo.main.java.input.ConfigurationReaderInterface;
import pl.execon.tmo.main.java.input.SourceDataReaderInterface;
import pl.execon.tmo.main.java.testclasses.TestManager;
import pl.execon.tmo.main.java.utils.*;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;


public class WebTesterEngine {

    private ConfigurationReaderInterface configurationReader;
    private SourceDataReaderInterface sourceDataReader;
    private CustomReporter reporter;
    private CustomReportGenerator reportGenerator;
    private RunProfile profile;

    // Nazwa testcase'u - classa która odpowiada za przechowywanie testcasow
    private Map<String, Class<? extends TestManager>> allTestClassMap;

    private TestNG testng = new TestNG();


    public WebTesterEngine(RunProfile profile,
                           ConfigurationReaderInterface configurationReaderInterface,
                           SourceDataReaderInterface sourceDataReader,
                           Map<String, Class<? extends TestManager>> allTestClassMap,
                           CustomReportGenerator reportGenerator) {

        this.configurationReader = configurationReaderInterface;
        this.sourceDataReader = sourceDataReader;
        this.allTestClassMap = allTestClassMap;
        this.reportGenerator = reportGenerator;
        this.profile = profile;
    }

    /**
     * Method used to init engine and start tests
     *
     * @throws IOException when create or validate configuration
     */
    public void startTests() throws IOException {
        Date date = new Date();
        ConfigurationManager configurationManager = ConfigurationManager.getInstance();
        configurationManager.setConfigurationReader(configurationReader);
        configurationManager.createConfiguration();
        configurationManager.validateConfiguration(profile);
        Configuration configuration = configurationManager.getConfiguration();
        Log.initLogger(configuration.getLoggingDepth());

        TestDataManager.getInstance().setSourceDataReader(sourceDataReader);

        reporter = new CustomReporter(profile, date.getTime(), reportGenerator);

        List<XmlSuite> xmlSuiteList = configurationManager.getAllXmlSuites(allTestClassMap);

        testng.setXmlSuites(xmlSuiteList);
        testng.addListener((ITestNGListener) reporter);
        testng.run();
    }
}
