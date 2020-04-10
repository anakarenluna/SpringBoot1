package com.example.proyectUser.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.proyectUser.dao.IuserService;
import com.example.proyectUser.entity.User;
import com.example.proyectUser.service.UserService;


@SpringBootApplication
@RestController
@RequestMapping("/user")
public class UserController {
	
	/*@Autowired
	public UserService userService;
	*/
	@Autowired
	public IuserService iuserService;
	@GetMapping("/prueba")
	public String getString()
	{
		return "Hola karen";
	}
	
	/*//Create user
	@PostMapping("")
	public void create(@Valid @RequestBody User users )
	{
		 userService.createUser(users);
	}

	@DeleteMapping("/{username}")
	public void delete(@PathVariable(value="username") String username) {
		userService.
	}
		*/
	@GetMapping("/mostrar")
	public List<User> listar()
	{
		List<User> user=iuserService.listar();
		return  user;
	}
	

}
