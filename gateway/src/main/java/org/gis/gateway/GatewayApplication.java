package org.gis.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Denis I.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GatewayApplication {
//TODO healthcheck in code?
    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
    }
}
