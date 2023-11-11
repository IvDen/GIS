package org.gis.discovery;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Denis I.
 */
//TODO del
//@Component
public class AppContextEventListener {

    @Value("${server.port}")
    String serverPort;

    @Value("${eureka.instance.hostname}")
    String hostname;

    @Value("${eureka.client.serviceUrl.defaultZone}")
    String defaultZone;

    @EventListener
    public void printProperties(ContextRefreshedEvent contextRefreshedEvent) {
        System.out.println("************************* ACTIVE PROPERTIES *************************");
        System.out.println(serverPort);
        System.out.println(hostname);
        System.out.println(defaultZone);
//        ((ConfigurableEnvironment) contextRefreshedEvent.getApplicationContext().getEnvironment())
//            .getPropertySources()
//            .stream()
//            .filter(ps -> ps instanceof OriginTrackedMapPropertySource)
//            // Convert each PropertySource to its properties Set
//            .map(ps -> ((OriginTrackedMapPropertySource) ps).getSource().entrySet())
//            .flatMap(Collection::stream)
//            // Print properties within each Set
//            .forEach(property -> System.out.println(property.getKey() + "=" + property.getValue()));

        System.out.println("*********************************************************************");
    }

}
