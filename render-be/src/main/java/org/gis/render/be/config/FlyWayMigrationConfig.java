package org.gis.render.be.config;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Denis I.
 */
@Slf4j
@Configuration
public class FlyWayMigrationConfig {

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean
    public Flyway flyWay() {
        Flyway flyway = Flyway.configure().dataSource(url, username, password).load();
        log.atDebug().log("{} | {}",username,url);
        //TODO delete
        log.atDebug().log(password);
        flyway.migrate();
        return flyway;
    }
}
