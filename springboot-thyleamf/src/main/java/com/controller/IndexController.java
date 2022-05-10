package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanZhao
 * @description 初始化启动
 * @date 2022年05月10日 15:12
 */

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(ModelMap map) {
        map.addAttribute("index", "Hello World!!!");
        return "index";
    }
}
