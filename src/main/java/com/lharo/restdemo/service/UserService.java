package com.lharo.restdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lharo.restdemo.persistence.User;
import com.lharo.restdemo.repo.UserRepo;

@Service
public class UserService {

	private UserRepo repo;
	
	@Autowired
	public UserService(UserRepo repo) {
		this.repo = repo;
	}
	
	public User findOne(Long id) {
		return repo.findById(id).orElse(null);
	}
	
	public List<User> findAll(){
		return (List<User>) repo.findAll();
	}
}
