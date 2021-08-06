package com.example.mvc.controller;

import com.example.mvc.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path = "/hello")
    public String hello(){
        return "get hello";
    }
    @RequestMapping(path = "/hi", method = RequestMethod.GET)
    public String hi() {
        return "hi";
    }
    //http://localhost:8080/api/get/path-variable/{변환하는 값 = name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name) {
        return name;
    }
    //http://localhost:8080/api/get/query-params?user=steve&email=steve@gmail.com&age=30
    @GetMapping(path = "query-params")
    public String queryParam(@RequestParam Map<String,String> queryParam) {
        //string에서 string 을 더하는(+) 행위는 메모리 할당과 메모리 해제를 발생시키며 더하는 연산이 많아진다면
        // 성능이 좋지않다.
        //그래서 나온 것이 StringBuilder이다.
        StringBuilder builder = new StringBuilder();
        //entryset은 key value를 반환하기 위한 함수
        queryParam.entrySet().forEach(entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");
            builder.append(entry.getKey()+" = "+entry.getValue()+ "\n");
        });

        return builder.toString();
    }
    //아까보단 명시적으로 받을것을 넣을 수 있다.
    @GetMapping("query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age
    ) {
      return name+email+age;
    }
    //현업에서 가장 자주 쓰이는 방법이다. 객체를 할땐 @RequestParam은 들어가지 않는다.
    @GetMapping("query-params03")
    public String queryParam03(UserRequest userRequest) {
        return userRequest.toString();
    }

}
