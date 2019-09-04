package com.qf.j1904.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Value("${server.port}")
    private String port;
    @RequestMapping("/product")
    public String show(){
        System.out.println("producer.port"+port);
        return "this is service-producer";
    }
}
