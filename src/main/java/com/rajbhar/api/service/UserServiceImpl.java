package com.rajbhar.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajbhar.api.dao.UserDAO;
import com.rajbhar.api.model.User;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;
	@Override
	public List<User> findAllUser() {
		// TODO Auto-generated method stub
		return (List<User>) dao.findAll();
	}

	@Override
	public List<User> addUsers(List<User> users) {
		// TODO Auto-generated method stub
		dao.save(users);
		return (List<User>) dao.findAll();
	}

	@Override
	public User findUserById(int id) {
		// TODO Auto-generated method stub
		return dao.findOne(id);
	}

	@Override
	public List<User> deleteUserById(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
		return (List<User>) dao.findAll();
	}

}
