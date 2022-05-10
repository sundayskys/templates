package com.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanZhao
 * @description TODO
 * @date 2022年05月10日 16:08
 */

@RestController
public class IndexController {

    @Value("${server.port}")
   private String port;

    @GetMapping("/")
    public String port(){
        return "端口号："+port;
    }
}
