package com.example.mvc;

import com.example.mvc.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MvcApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("hollo");
		//Object Mapper란
		//Text 형태의 Json -> Object
		var objectMapper = new ObjectMapper();
		//Object -> Text형태 Json
		var user = new User("jun",10);
		//objectMapper는 get method 를 활용한다.
		//object -> text
		var text = objectMapper.writeValueAsString(user);
		//text->object
		var objectUser = objectMapper.readValue(text,User.class);
		System.out.println(objectUser);
	}

}
