package com.stackroute.noteapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.stackroute.noteapp.model.User;


@Service("userService")
public class UserServiceImpl implements UserService {

	private List<User> userList = new ArrayList<User>();

	public boolean save(User user) {
		if (get(user.getId()) == null) {
			userList.add(user);
			return true;
		}

		// TODO Auto-generated method stub
		return false;
	}

	public boolean update(User user) {
		if (get(user.getId()) != null) {
			userList.add(user);
			return true;
		}

		// TODO Auto-generated method stub
		return false;
	}

	public boolean delete(String id) {
		User user = get(id);
		if (user != null) {
			userList.remove(user);
			return true;
		}

		// TODO Auto-generated method stub
		return false;
	}

	public User get(String id) {
		
		for (User user : userList) {
			if(user.getId().equals(id))
			{
				return user;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	public boolean validate(String id, String password) {
		
		User user = get(id);
		if(user==null)
		{
			return false;
		}
		if(user.getPassowrd().equals(password))
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
	}

	public List<User> get() {
		// TODO Auto-generated method stub
		return userList;
	}

}
