package pl.execon.tmo.main.java.testclasses;

import org.apache.commons.cli.*;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import pl.execon.tmo.main.java.WebTesterEngine;
import pl.execon.tmo.main.java.configuration.RunProfile;
import pl.execon.tmo.main.java.input.XlsConfigurationReader;
import pl.execon.tmo.main.java.input.XlsSourceDataReader;
import pl.execon.tmo.main.java.utils.ConfigurationManager;
import pl.execon.tmo.main.java.utils.EmailReportGenerator;

public class MainClass {

    private static WebTesterEngine engine;
    private static Options options = new Options();
    private static final String CONFIG_PARAM = "config";
    private static final String PROFILE_PARAM = "profile";
    private static final String CHROMEDRIVER_PATH_PARAM = "chromedriverpath";
    private static final String IEDRIVER_PATH_PARAM = "iedriverpath";
    private static final String FIREFOXDRIVER_PATH_PARAM = "firefoxdriverpath";

    private static final RunProfile DEFAULT_RUN_PROFILE = RunProfile.PRODUCTION;
    private static final String DEFAULT_PRIMARY_SOURCE = "Execon_-_DPD_Track_And_Trace_main.xlsx";
    private static final String CONFIGURATION_SHEET_NAME = "konfiguracja główna";

    private MainClass() { }

    public static void main(String[] args) throws IOException, ParseException {
        options.addOption(CONFIG_PARAM, true, "Set path to configuration file");
        options.addOption(CHROMEDRIVER_PATH_PARAM, true,
                "Set path to Selenium Chrome Driver executable");
        options.addOption(FIREFOXDRIVER_PATH_PARAM, true,
                "Set path to Selenium Firefox executable");
        options.addOption(PROFILE_PARAM, true, "Set running profile");

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        String configFile;
        if (cmd.hasOption(CONFIG_PARAM)) {
            configFile = cmd.getOptionValue(CONFIG_PARAM);
        } else {
            configFile = DEFAULT_PRIMARY_SOURCE;
        }

        RunProfile profile;
        if (cmd.hasOption(PROFILE_PARAM)) {
            try {
                profile = RunProfile.valueOf(cmd.getOptionValue(PROFILE_PARAM));
            } catch (IllegalArgumentException e) {
                System.out.println("Unknown profile parameter: " + cmd.getOptionValue(PROFILE_PARAM)
                        + " Use default " + DEFAULT_RUN_PROFILE);
                profile = DEFAULT_RUN_PROFILE;
            }
        } else {
            profile = DEFAULT_RUN_PROFILE;
        }

        if (cmd.hasOption(CHROMEDRIVER_PATH_PARAM)) {
            File chromeDriver = new File(cmd.getOptionValue(CHROMEDRIVER_PATH_PARAM));
            if (chromeDriver.exists()) {
                System.setProperty(ConfigurationManager.CHROMEDRIVER_SYSTEM_PROPERTY_KEY,
                        chromeDriver.getAbsolutePath());
            } else {
                throw new IOException(
                        "File " + cmd.getOptionValue(CHROMEDRIVER_PATH_PARAM) + " does not exist");
            }
        }

        if (cmd.hasOption(FIREFOXDRIVER_PATH_PARAM)) {
            File firefoxDriver = new File(cmd.getOptionValue(FIREFOXDRIVER_PATH_PARAM));
            if (firefoxDriver.exists()) {
                System.setProperty(ConfigurationManager.FIREFOX_SYSTEM_PROPERTY_KEY, firefoxDriver.getAbsolutePath());
            } else {
                throw new IOException("File " + cmd.getOptionValue(FIREFOXDRIVER_PATH_PARAM) + " does not exist");
            }
        }

        Map<String, Class<? extends TestManager>> classMap = new HashMap<>();
        classMap.put("TS00", TestSuite00Manager.class);

        engine = new WebTesterEngine(profile,
                new XlsConfigurationReader(configFile, CONFIGURATION_SHEET_NAME), new XlsSourceDataReader(),
                classMap, EmailReportGenerator.getInstance());
        engine.startTests();
        System.exit(0);
    }
}
