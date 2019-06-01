package com.rajbhar.api.service;

import java.util.List;

import com.rajbhar.api.model.User;

public interface UserService {
	
	public List<User> findAllUser();
	
	public List<User> addUsers(List<User> users);
	
	public User findUserById(int id);
	
	public List<User> deleteUserById(int id);

}
