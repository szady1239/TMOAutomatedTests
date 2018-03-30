package pl.execon.tmo.main.java.input;

import pl.execon.tmo.main.java.data.Configuration;

import java.io.IOException;

/**
 * Fasade do generate configuration object
 *
 * @author Pawel Lagodzinski
 * @author Mateusz Grajper
 * @since 2016-07-15
 * @version 1.0
 */

public interface ConfigurationReaderInterface {

    /**
     * Generate configuration object
     *
     * @return object containing configuration data
     * @throws IOException when can't generate configuration object
     * @see Configuration
     */

    Configuration readConfiguration() throws IOException;
}
