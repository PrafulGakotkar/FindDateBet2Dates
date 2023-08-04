package com.Numitry.in.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Numitry.in.entity.User;
import com.Numitry.in.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public User addUser(@PathVariable User user) {
		return service.setUser(user);
	}
	
	@GetMapping("/date")
	public ResponseEntity<List<User>> getLaptopsByCreatedDate (@RequestParam LocalDate startDate,
			@RequestParam LocalDate endDate) {
		return new ResponseEntity<List<User>>(service.findByDate(startDate,endDate), HttpStatus.OK);
}
	
	
	

}
