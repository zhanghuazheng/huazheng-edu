package com.huazheng.system.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname TestController
 * @Description TODO
 * @Date 2020/7/2 18:02
 * @Created by zhanghuazheng
 */
@RestController
public class TestController {
    @GetMapping("/hello")
    public String testHello(){
        return "hello world";
    }
}
