package com.example.proyectUser.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.proyectUser.entity.User;

public interface UserDao extends JpaRepository<User, Integer> {

	
	
	
}
