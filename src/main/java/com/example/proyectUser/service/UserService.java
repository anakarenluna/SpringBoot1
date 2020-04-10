package com.example.proyectUser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.proyectUser.dao.IuserService;
import com.example.proyectUser.dao.UserDao;
import com.example.proyectUser.entity.User;

@Service

public class UserService implements IuserService {
	
	
	
	@Autowired
	public UserDao userDao;
	
	/*public void createUser(User users)
	{
		userDao.save(users);
	}
	
	public boolean findUsername(String Username)
	{
		boolean res;
		User user = userDao.findUsername(Username);
		if(user.getUsername().equals(Username))
		{
			 res=true;
		  
		}
		else
		{
			res=false;
		}
		return res;
		
	}*/
   
	@Override
	public List<User> listar() {
		// TODO Auto-generated method stub
		return (List <User>) userDao.findAll(); //sabe que es de tipo lista
	}

	@Override
	public boolean buscarUsername() {
		// TODO Auto-generated method stub
		return false;
	}

}
