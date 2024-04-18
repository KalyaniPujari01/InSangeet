package com.sangeet.in.service;

import java.util.List;

import com.sangeet.in.entity.User;

public interface UserService {

	
	public User addUser(User theUser);
	public User updateUser(User theUser);
	public List<User> getAllUser();
	public void deleteUserById(int id);
}
