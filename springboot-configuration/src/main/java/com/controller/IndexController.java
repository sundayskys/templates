package com.controller;

import com.properties.HostConfiguration;
import com.properties.HostProperties;
import org.apache.catalina.Host;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanZhao
 * @description TODO
 * @date 2022年05月10日 16:08
 */

@RestController
public class IndexController {

    @Autowired
    private HostConfiguration hostConfiguration;

    @GetMapping("/")
    public String host() {
        return "网站:"+hostConfiguration.getAddress()+"端口:"+hostConfiguration.getPort();
    }
}
