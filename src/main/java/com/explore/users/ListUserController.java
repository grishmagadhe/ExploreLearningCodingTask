package com.explore.users;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.explore.users.service.UserService;

@RestController
@RequestMapping("/ws/user")
public class ListUserController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public Map<String, Object> getAllUsersAsJson() {
		return userService.getAllUsers();
	}
}
