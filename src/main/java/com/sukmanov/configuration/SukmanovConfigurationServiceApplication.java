package com.sukmanov.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SukmanovConfigurationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SukmanovConfigurationServiceApplication.class, args);
    }

}
