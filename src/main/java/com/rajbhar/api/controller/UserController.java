package com.rajbhar.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajbhar.api.model.User;
import com.rajbhar.api.service.UserServiceImpl;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@Autowired
	private UserServiceImpl userService;
	@GetMapping("/getAllUser")
	public List<User> getUser()
	{
		return  userService.findAllUser();
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users)
	{
		return userService.addUsers(users);
	}
	
	@GetMapping("/getUsersById/{user_id}")
	public User getUsersById(@PathVariable int user_id)
	{
		return userService.findUserById(user_id);
	}
	@DeleteMapping("/deleteUsersById/{user_id}")
	public List<User> deleteUsersById(@PathVariable int user_id)
	{
		return userService.deleteUserById(user_id);
	}
	
}
