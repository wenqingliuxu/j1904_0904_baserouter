package com.qf.j1904;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class J19040904ServiceRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(J19040904ServiceRibbonApplication.class, args);
    }

}
