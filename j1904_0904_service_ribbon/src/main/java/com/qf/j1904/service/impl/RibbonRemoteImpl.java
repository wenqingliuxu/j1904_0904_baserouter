package com.qf.j1904.service.impl;

import com.qf.j1904.service.RibbonRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class RibbonRemoteImpl implements RibbonRemote {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String fetchInfo(){
        String object = restTemplate.getForObject("http://SERVICE-PRODUCER/product", String.class);
        return object;
    }
}
