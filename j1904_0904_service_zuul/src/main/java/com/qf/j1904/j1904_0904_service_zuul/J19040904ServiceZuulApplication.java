package com.qf.j1904.j1904_0904_service_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy //开启路由代理服务
public class J19040904ServiceZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(J19040904ServiceZuulApplication.class, args);
    }

}
