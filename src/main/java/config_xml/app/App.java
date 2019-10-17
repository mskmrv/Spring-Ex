package config_xml.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

//        Car car = (Car) context.getBean("car");
        Car car = context.getBean("car", Car.class);
        car.doMove();
    }
}
