package com.lharo.restdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lharo.restdemo.persistence.User;
import com.lharo.restdemo.service.UserService;

@RestController
public class UserController {

	@Autowired UserService service;
	
	@RequestMapping(value={"/users"})
	@GetMapping
	public ResponseEntity<?> getUsers() {
		
		List<User> list = service.findAll();
		
		return ResponseEntity.ok(list);
		
	}
}
