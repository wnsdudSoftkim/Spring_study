package com.example.mvc.controller;

import com.example.mvc.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // 해당 class는 REST API를 처리하는 controller
@RequestMapping("/api") // RequestMapping URl 을 지정해주는 annotation
public class ApiController {
    //ctrl space 하면 자동완성
    @GetMapping("/hello") // http://localhost:8080/api/hello
    public String hello() {
        return "hello spring boot";
    }
    @GetMapping("/text")
    public String text(@RequestParam String account ) {
        return account;
    }
    //json
    // req -> object mapper -> Object -> method -> object -> object mapper -> json -> response
    @PostMapping("/json")
    public User json(@RequestBody User user) {
        return user;
    }
    @PutMapping("/put")
    public ResponseEntity<User> put(@RequestBody User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(user);
    }
}
