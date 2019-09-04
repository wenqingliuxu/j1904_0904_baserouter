package com.qf.j1904;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class J19040904ServiceServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(J19040904ServiceServerApplication.class, args);
    }

}
