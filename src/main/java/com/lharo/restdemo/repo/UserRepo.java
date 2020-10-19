package com.lharo.restdemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.lharo.restdemo.persistence.User;

public interface UserRepo extends CrudRepository<User, Long> {

}
