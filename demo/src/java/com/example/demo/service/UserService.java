package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	/*public UserService(UserRepository userRepository) {
		this.userRepository=userRepository;
	}*/
	
	public User saveOrUpdate(User user) {
		User savedUser=userRepository.save(user);
		return savedUser;
	
	}
	
	public User getUser(int id) {
	
		return userRepository.findById(id).get();
	}
	
}
