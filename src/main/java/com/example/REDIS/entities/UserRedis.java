package com.example.REDIS.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
@RedisHash(value = "user", timeToLive = 60)
public class UserRedis implements Serializable {
	
	@Id
	private Long id;
	private String name;
	private String surname;
	
	public UserRedis(Long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	
	public UserRedis() {
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSurname() {
		return surname;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;
	}
}
