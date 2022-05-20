package com.controoler;

import org.springframework.web.bind.annotation.*;

/**
 * @author YanZhao
 * @description 初始化启动
 * @date 2022年05月10日 15:12
 */

@RestController
public class IndexController {

    @GetMapping("index")
    public String index(){
        return "Hello-World";
    }

    // http://localhost:5600/foo/abc
    @GetMapping("/foo/{id}")
    public String getById(@PathVariable String id) {
        return "ID：" + id;
    }

    // Get：http://localhost:5600/foo?id=abc
    // Post: http://localhost:5600/foo Body{"id":"abc"}
    @RequestMapping("/foos")
    public String getByIdWithParam(@RequestParam(value = "ids") String id) {
        return "ID：" + id;
    }

}
