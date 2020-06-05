package com.example.microservicecloud05eureka6002;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer_6002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_6002.class, args);
    }
}
