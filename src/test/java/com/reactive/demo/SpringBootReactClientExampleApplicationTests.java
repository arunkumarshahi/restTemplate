package com.reactive.demo;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sg.api.model.User;
import com.sg.api.service.ApiService;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
class SpringBootReactClientExampleApplicationTests {
	@Autowired
	ApiService apiService;

	@Test
	void contextLoads() {
		log.info("context loaded successfully ...");
	}
	
	@Test
	void getUsers() {
		List<User> users = apiService.getUsers(2);
		log.info("size of user ::",users.size());
	}

}
