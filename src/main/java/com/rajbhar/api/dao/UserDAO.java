package com.rajbhar.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.rajbhar.api.model.User;

public interface UserDAO extends CrudRepository<User, Integer> {

}
