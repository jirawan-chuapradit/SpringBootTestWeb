package com.example.demo.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;
	
	//GET all users
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return service.findAll();
	}	
	
	//GET /user/{id}
	@GetMapping("/user/{id}")
	public User getUser(@PathVariable int id) {
		return service.findOne(id);
	}
	
}
