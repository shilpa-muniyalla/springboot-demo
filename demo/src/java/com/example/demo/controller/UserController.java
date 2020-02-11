package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.domain.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@RequestMapping("/greeting")
	public String greetingUser() {
		return "Hi shilpa ";
	}
	
	@RequestMapping("/wish")
	public String wishUser() {
		return "Happy birthday shilpa from praveen";
	}
	
	@GetMapping("/usersdata")
	public List<User> usersData() {
		User user1 = new User();
		user1.setFirstName("praveena");
		user1.setLastName("rao");
		
		User user2 = new User();
		user2.setFirstName("shilpa");
		user2.setLastName("muniyalla");
		
		List<User> list = new ArrayList<User>();
		list.add(user1);
		list.add(user2);
		
	return list;
		
	}
	
	@PostMapping("/postuser")
	public User postUser(@RequestBody User user1, @RequestParam String age) {
		User result= new User();
		String firstName=user1.getFirstName().toUpperCase();
		String lastName=user1.getLastName().toUpperCase();
		
		result.setFirstName(firstName);
		result.setLastName(lastName);
		result.setAge(age);
		
		return result;
		
	}
	
	@PostMapping
	public User saveOrUpdateUser(@RequestBody User user) {
		return userService.saveOrUpdate(user);
	}
	
	@GetMapping(path="/{id}")
	public User getUser(@PathVariable int id) {
		return userService.getUser(id);
	}
	
}
