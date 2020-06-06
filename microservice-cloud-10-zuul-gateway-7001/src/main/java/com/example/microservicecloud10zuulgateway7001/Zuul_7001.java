package com.example.microservicecloud10zuulgateway7001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient
@EnableZuulProxy
@SpringBootApplication
public class Zuul_7001 {

	public static void main(String[] args) {
		SpringApplication.run(Zuul_7001.class, args);
	}

}
