package com.SpringScheduler.demoScheduler.repository;

import org.springframework.data.repository.CrudRepository;

import com.SpringScheduler.demoScheduler.model.User;

public interface UserRepo extends CrudRepository<User,Integer>{

}
