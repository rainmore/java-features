package com.rainmore.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan({"com.rainmore.domains", "com.rainmore.modules", "com.rainmore.api"})
@EntityScan("com.rainmore.domains")
@EnableJpaRepositories("com.rainmore.modules")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}