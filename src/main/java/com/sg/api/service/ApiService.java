package com.sg.api.service;

import java.util.List;

import com.sg.api.model.User;

public interface ApiService {
public List<User> getUsers(int limit);
}
