package com.qf.j1904;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class J19040904ServiceProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J19040904ServiceProducerApplication.class, args);
    }

}
