package com.springboot.HelloWorld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Health {

    @RequestMapping(method = RequestMethod.GET)

    public String sayHello() {
        return "Hello";
    }

    @RequestMapping(method = RequestMethod.GET, path = "/helloworld")
    public String sayHelloWorld() {
        return "Hello World";
    }
}
