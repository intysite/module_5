package org.example.homework1.config;

import org.example.homework1.entity.Worker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class Config {

    @Bean
    public Worker misha() {
        return new Worker("Мишка");
    }

    @Bean
    public Worker zelia() {
        return new Worker("Зеля");
    }
}
