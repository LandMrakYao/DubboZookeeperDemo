package com.practice.springboot;


import com.practice.springboot.dubbo.provider.SayHello;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
public class Controller {

    @Resource
    SayHello sayHello;
    @RequestMapping("/hello")
    public String hello(){
        return sayHello.sayHello("GuanYi");
    }
}