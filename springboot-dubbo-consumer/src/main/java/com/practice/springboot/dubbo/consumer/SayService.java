package com.practice.springboot.dubbo.consumer;

import com.practice.springboot.dubbo.provider.SayHello;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Component;
@Component
public class SayService {
    @Reference
    private SayHello sayHello;

    public String hello(String name){
        return  sayHello.sayHello(name);
    }


}