package com.example.REDIS.services;

import com.example.REDIS.entities.User;
import com.example.REDIS.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public User createUser(User user){
		return userRepository.saveAndFlush(user);
	}
	public User readUser(int id){
		return userRepository.findById(id).get();
	}
	public User updateUser(User user){
		return userRepository.saveAndFlush(user);
	}
	public User deleteUser(User user){
		userRepository.delete(user);
		return user;
	}
}
