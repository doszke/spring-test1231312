package com.doszke.springtest1231312.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping({"/"})
    public String sayHello(){
        StringBuilder sb = new StringBuilder();
        sb.append("<html><head><title>Hello World</title></head><body><h1>Hello world!</h1></body></html>");
        return sb.toString();
    }

}
