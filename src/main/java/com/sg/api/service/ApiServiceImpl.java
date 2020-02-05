package com.sg.api.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sg.api.model.Name;
import com.sg.api.model.User;
import com.sg.api.model.UserData;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@Slf4j
public class ApiServiceImpl implements ApiService {
//@Autowired
//	private RestTemplate restTemplate;
   @Value("${api.url}")
   private String api_url;
	@Override
	public Flux<User> getUsers(Mono<Integer> limit) {

	        return WebClient
	                .create(api_url)
	                .get()
	                .uri(uriBuilder -> uriBuilder.queryParam("limit", limit.block()).build())
	                .accept(MediaType.APPLICATION_JSON)
	                .exchange()
	                .flatMap(resp -> resp.bodyToMono(UserData.class)).flatMapIterable(UserData::getUserData);
	    }

}
