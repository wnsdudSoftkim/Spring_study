package com.example.mvc.controller;

import com.example.mvc.dto.PostRequestdto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostAPiController {
    @PostMapping("/post")
    //Post일때는 @ReqeustBody를 해야함
    //보내는 쪽에서 Header에 Content-type  : application/json 해주고
    //body에 {
    //  "account":"user01",
    //  "email":"junyoung",
    //  "nickname":"준영"
    //}
    //하지만 항상 이런식으로 받을 순 없으니까
    public void post(@RequestBody Map<String,Object> requestData) {
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("Key:"+stringObjectEntry.getKey());
            System.out.println("Value:"+stringObjectEntry.getValue());

        });
    }
    @PostMapping("/post2")
    public void post2(@RequestBody PostRequestdto postRequestdto) {
        System.out.println(postRequestdto.toString());
    }
}
