package com.fengluo.learn.demo01;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: fengluo
 * @Date: 2024/3/31 12:19
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("hello")
    public String hello() {
        return "nice to meet you!";
    }

}