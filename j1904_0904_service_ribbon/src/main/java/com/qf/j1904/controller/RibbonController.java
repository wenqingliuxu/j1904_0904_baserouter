package com.qf.j1904.controller;

import com.qf.j1904.service.RibbonRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;


@RestController
public class RibbonController {
    @Value("${server.port}")
    private String port;
    @Autowired
    private RibbonRemote ribbonRemote;

    @RequestMapping("/ribbon")
    public String info(){
        System.out.println("ribbon.port = "+ port);
        String info = ribbonRemote.fetchInfo();
        return "ribbon service: "+ info;
    }
}
