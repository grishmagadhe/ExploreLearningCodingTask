package com.explore.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.explore.users.model.User;
import com.explore.users.service.UserService;

@RestController
@RequestMapping("/ws/user")
public class ListUserByIdController {
	
	@Autowired
	UserService userService;

	@RequestMapping(value = "/list/{id}", method = RequestMethod.GET)
	public User getUserFromJsonById(@PathVariable int id) {
		User user = userService.getUserById(id);
		return user;
	}

}
