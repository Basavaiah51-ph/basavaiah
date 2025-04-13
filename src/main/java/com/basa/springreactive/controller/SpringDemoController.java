package com.basa.springreactive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringDemoController {

    @GetMapping(value = "/hello")
    public String getMessage(){
        return "Hello Spring";
    }
}
