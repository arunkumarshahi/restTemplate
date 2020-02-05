package com.sg.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sg.api.service.ApiService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootReactClientExampleApplication implements CommandLineRunner {
@Autowired
	ApiService apiService;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootReactClientExampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//log.info("size :::"+apiService.getUsers(10).get(0).getName().getLast());
	}

}
