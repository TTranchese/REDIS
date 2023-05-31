package com.example.REDIS.repositories;

import com.example.REDIS.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
