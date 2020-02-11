package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping
	public Customer saveOrUpdate(@RequestBody Customer customer) {
		return customerService.saveOrUpdate(customer);
	}
	
	@GetMapping(path="/{id}")
	public Customer getCustomer(@PathVariable int id) {
		return customerService.getCustomer(id);
	}

	@GetMapping
	public List<Customer> getAllCustomer(){
		return customerService.getAllCustomer();
		
	}
}
