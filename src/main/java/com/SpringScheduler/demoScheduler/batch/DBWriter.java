package com.SpringScheduler.demoScheduler.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.SpringScheduler.demoScheduler.model.User;
import com.SpringScheduler.demoScheduler.repository.UserRepo;

@Component
public class DBWriter implements ItemWriter<User>{

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void write(List<? extends User> users) throws Exception {

		System.out.println("Data saved for users: "+ users);
		userRepo.saveAll(users);
		
	}

}
