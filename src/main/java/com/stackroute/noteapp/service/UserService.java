package com.stackroute.noteapp.service;

import java.util.List;

import com.stackroute.noteapp.model.User;



public interface UserService {
	
	//CRDU Operations
	
	
	//save user
	
	public boolean   save(User user);
	
	
	
	//update user
	public boolean   update(User user);
	
	//delete user
	public boolean   delete(String id);
	
	//get user by id
	public User   get(String id);
	//validate
	public boolean   validate(String id, String password);
	
	//get all users
	public List<User>   get();
}
