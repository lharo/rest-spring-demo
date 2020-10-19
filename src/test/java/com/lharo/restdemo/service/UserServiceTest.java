package com.lharo.restdemo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.lharo.restdemo.persistence.User;
import com.lharo.restdemo.repo.UserRepo;

class UserServiceTest {

	private final UserRepo repo= Mockito.mock(UserRepo.class);
	
	private UserService userService = new UserService(repo);

	@Test
	void testFindOne() {

		//Given
		Long id = 1l;
		Optional<User> optional = Optional.of(new User());
		
		//When
		Mockito.when(repo.findById(Mockito.any())).thenReturn(optional);
		User u = userService.findOne(id);
		
		//Then
		assertNotNull(u);
		Mockito.verify(repo, Mockito.times(1)).findById(Mockito.any());
		
	}

}


