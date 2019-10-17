package config_xml.app;

public class Car {
    private CarEngine carEngine;

//    public Car(CarEngine carEngine) {
//        this.carEngine = carEngine;
//    }

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
