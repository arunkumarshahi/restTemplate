package com.sg.api.service;

import java.util.List;

import com.sg.api.model.User;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ApiService {
	public Flux<User> getUsers(Mono<Integer> limit);
}
