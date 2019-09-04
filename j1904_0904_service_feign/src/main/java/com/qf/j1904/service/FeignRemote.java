package com.qf.j1904.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value="SERVICE-PRODUCER")
public interface FeignRemote {
    @RequestMapping("/product")
    public String fetchInfo();
}
