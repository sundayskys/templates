package com.redis.controller;

import com.redis.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author YanZhao
 * @description
 * @date 2022年05月21日 22:06
 */

@RestController
public class IndexController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private RedisUtils redisUtils;

    @GetMapping("/")
    public String index(){
        return "Port:"+redisTemplate.getConnectionFactory().getConnection().ping();
    }

    @GetMapping("name")
    public String name(){
        redisTemplate.opsForValue().set("username","张三");
        Object username = redisTemplate.opsForValue().get("username");
        return username.toString();
    }

    @GetMapping("age")
    public String age(){
        redisUtils.set("age", 18);
        return redisUtils.get("age").toString();

    }

}
