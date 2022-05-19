package com.locks.controller;

import com.locks.annotation.Lock;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: pjmike
 * @create: 2019/04/24 21:30
 */

@RestController
public class TestController {

    @Lock(key = "redis_lock")
    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
