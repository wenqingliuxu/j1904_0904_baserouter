package com.qf.j1904;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class J19040904ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(J19040904ServiceFeignApplication.class, args);
    }

}
