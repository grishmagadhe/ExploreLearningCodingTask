package com.explore.users.service;

import java.util.Map;

import com.explore.users.model.User;

public interface UserService {

	public User getUserById(int id);
	public Map<String, Object> getAllUsers();
	public User deleteUserById(int id);
}
