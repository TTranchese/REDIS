package com.example.REDIS.entities;

import jakarta.persistence.*;

@MappedSuperclass
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String surname;
	
	public User() {
	}
	
	public User(Long id, String name, String surname) {
		this.id = id;
		this.name = name;
		this.surname = surname;
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
