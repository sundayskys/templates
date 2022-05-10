package com.controoler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanZhao
 * @description 初始化启动
 * @date 2022年05月10日 15:12
 */

@RestController
public class IndexController {


    @GetMapping("/")
    public String index(){

        return "Hello-World";
    }
}
