package com.example.microservicecloud05eureka6002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicroserviceCloud05Eureka6002Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCloud05Eureka6002Application.class, args);
    }
}
