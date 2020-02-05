package com.sg.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.sg.api.model.User;
import com.sg.api.model.UserData;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ApiServiceImpl implements ApiService {
@Autowired
	private RestTemplate restTemplate;
   @Value("${api.url}")
   private String api_url;
	@Override
	public List<User> getUsers(int limit) {
		log.info("api ep --> "+api_url);
		// TODO Auto-generated method stub
		UriComponentsBuilder uriBuilder = UriComponentsBuilder.fromUriString(api_url).queryParam("limit", limit);
		UserData userData=restTemplate.getForObject(uriBuilder.toUriString(), UserData.class);
		return userData.getData();
	}

}
