package com.mengxuegu.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @Auther: 梦学谷
 */
@MapperScan("com.mengxuegu.springcloud.mapper")
@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
public class ProductProvider_8001 {

    public static void main(String[] args) {
        SpringApplication.run(ProductProvider_8001.class, args);
    }

}
