package com.explore.users.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.explore.users.MainApplication;
import com.explore.users.exceptions.UserNotFoundexception;
import com.explore.users.model.User;

@Component("userService")
public class UserServiceImpl implements UserService {

	@Override
	public User getUserById(int id) throws UserNotFoundexception {
		User user=MainApplication.userDetails.get(id);	
		if(user==null){
			throw new UserNotFoundexception("User Id not present");
		}
		return user;
	}

	@Override
	public Map<String, Object> getAllUsers() {
		Map<String, Object> response = new HashMap<String, Object>();
		Collection<User> users = MainApplication.userDetails.values();
		response.put("totalUsers", users.size());
		response.put("users", users);
		return response;
	}

	@Override
	public User deleteUserById(int id) throws UserNotFoundexception {
		User user = null;
		if (MainApplication.userDetails.containsKey(id)) {
			user = MainApplication.userDetails.get(id);
			MainApplication.userDetails.remove(id);
		}else {
			throw new UserNotFoundexception("User Id not present");
		}
		return user;
	}

}
