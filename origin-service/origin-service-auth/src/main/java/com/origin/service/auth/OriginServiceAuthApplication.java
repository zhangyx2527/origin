package com.origin.service.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author zhangyuxuan
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages = "com.origin")
public class OriginServiceAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(OriginServiceAuthApplication.class, args);
    }

}
