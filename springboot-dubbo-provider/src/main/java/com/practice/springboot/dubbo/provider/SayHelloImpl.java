package com.practice.springboot.dubbo.provider;


import org.springframework.stereotype.Service;

@Service
public class SayHelloImpl implements SayHello{
    @Override
    public String sayHello(String name)
    {
        return "Hello "+name+" !";
    }
}