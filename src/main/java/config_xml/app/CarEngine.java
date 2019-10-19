package config_xml.app;

import org.springframework.stereotype.Component;

@Component("carEngine")
public class CarEngine {

    public void doStart() {
        System.out.println("Двигатель завелся!");
    }
}
