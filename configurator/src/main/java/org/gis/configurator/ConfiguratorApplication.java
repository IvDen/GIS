package org.gis.configurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Denis I.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfiguratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfiguratorApplication.class, args);
    }
}
