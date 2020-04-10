package com.example.proyectUser.dao;

import java.util.List;

import com.example.proyectUser.entity.User;

public interface IuserService {
	public List<User> listar();
	public boolean buscarUsername();

}
