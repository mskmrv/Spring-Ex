package config_xml.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("config_xml.app")
public class Config {
    @Bean
    public Car car() {
        return new Car();
    }
}
