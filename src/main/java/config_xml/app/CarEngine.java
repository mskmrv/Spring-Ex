package config_xml.app;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("carEngine")
@Scope("prototype")
public class CarEngine {

    public void doStart() {
        System.out.println("Двигатель завелся!");
    }
}
