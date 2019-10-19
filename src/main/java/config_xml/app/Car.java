package config_xml.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("car")
public class Car {
    @Autowired
    private CarEngine carEngine;

    public void doMove() {
        carEngine.doStart();
        System.out.println("Автомобиль едет!");
    }

    public CarEngine getCarEngine() {
        return carEngine;
    }

    public void setCarEngine(CarEngine carEngine) {
        this.carEngine = carEngine;
    }
}
