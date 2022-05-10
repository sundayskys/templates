package com.controoler;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanZhao
 * @description 初始化启动
 * @date 2022年05月10日 15:12
 */

@RestController
public class IndexController {

    @Value("${spring.profiles.active}")
    private String active;

    @Value("${server.port}")
    private String port;

    @GetMapping("/")
    public String index(){
        return active + "环境被激活，" + "端口:" + port;
    }
}
