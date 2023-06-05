package com.example.REDIS.services;

import com.example.REDIS.entities.UserJPA;
import com.example.REDIS.repositories.jpa.UserJPARepository;
import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class UserService {
	@Autowired
	private UserJPARepository userJPARepository;
	
	public UserJPA createUser(UserJPA user){
		return userJPARepository.saveAndFlush(user);
	}
	public UserJPA readUser(Long id){
		return userJPARepository.findById(id).get();
	}
	public UserJPA updateUser(UserJPA user){
		return userJPARepository.saveAndFlush(user);
	}
	public UserJPA deleteUser(UserJPA user){
		userJPARepository.delete(user);
		return user;
	}
}
