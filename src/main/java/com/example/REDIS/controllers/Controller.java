package com.example.REDIS.controllers;

import com.example.REDIS.entities.User;
import com.example.REDIS.services.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class Controller {
	private UserService userService;
	
	@PostMapping
	public User post(@RequestBody User user){
		return userService.createUser(user);
	}
}
