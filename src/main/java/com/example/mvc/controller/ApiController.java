package com.example.mvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 해당 class는 REST API를 처리하는 controller
@RequestMapping("/api") // RequestMapping URl 을 지정해주는 annotation
public class ApiController {
    //ctrl space 하면 자동완성
    @GetMapping("/hello") // http://localhost:8080/api/hello
    public String hello() {
        return "hello spring boot";
    }
}
