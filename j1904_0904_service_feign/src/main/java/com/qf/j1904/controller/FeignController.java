package com.qf.j1904.controller;

import com.qf.j1904.service.FeignRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private FeignRemote feignRemote;
    @RequestMapping("/feign")
    public String info(){
        System.out.println("feign client port =" + port);
        String info = feignRemote.fetchInfo();
        return "feign service: "+ info;
    }
}
