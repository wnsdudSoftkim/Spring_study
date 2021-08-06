package com.example.mvc.controller;

import com.example.mvc.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {
    @RequestMapping("/main")
    //이러한 controller는 return 자체가 string이 되면
    // 자동으로 resource에 있는 return 값을 찾아가게 된다.
    public String main() {
        return "main.html";
    }

    //ResponseEntity
    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User();
        user.setName("steve");
        user.setAddress("패스트");
        return user;
    }
}
