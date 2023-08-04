package com.Numitry.in.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Numitry.in.entity.User;
import com.Numitry.in.repository.UserRepository;

import lombok.Data;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User setUser(User user) {
		return repo.save(user);		
	}
	
	public List<User> findByDate(LocalDate strDate , LocalDate endDate){
		return repo.findUserBetweenDates(strDate, endDate);
	}

}
