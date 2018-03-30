package pl.execon.tmo.main.java.testclasses;

import java.io.InputStream;

/**
 * Class used to get information inside jar
 *
 * @author Pawel Lagodzinski
 * @since 2016-07-06
 * @version 1.0
 *
 */
public class BasicAppConfiguration {

    /**
     * Get log4j configuration file
     *
     * @return log4j configuration file as stream
     */

    public InputStream getLogConfigurationFileAsStream() {
        return getClass().getResourceAsStream("/main/resources/log4j.properties");
    }
}
