package com.controller;

import com.properties.HostConfiguration;
import com.properties.HostFileProperties;
import com.properties.HostProperties;
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

    private final HostProperties hostProperties;

    @Autowired
    private HostFileProperties hostFileProperties;

    @Autowired
    public IndexController(HostProperties hostProperties) {
        this.hostProperties = hostProperties;
    }


    @GetMapping("/")
    public String host() {
        return "网站:"+hostConfiguration.getAddress()+"端口:"+hostConfiguration.getPort();
    }

    @GetMapping("/host")
    public String hostProperties() {
        return "网站:"+hostProperties.getAddress()+"端口:"+hostProperties.getPort();
    }
    @GetMapping("hostfiles")
    public String hostfileProperties(){
        return "网站:"+hostFileProperties.getAddress()+"端口:"+hostFileProperties.getPort();

    }
}
