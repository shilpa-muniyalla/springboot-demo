package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.domain.Customer;


@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer saveOrUpdate(Customer customer) {
		return customerRepository.save(customer);
	}
	
	public Customer getCustomer(int id) {
		return customerRepository.findById(id).get();
	}
	
	public List<Customer> getAllCustomer(){
		List<Customer> list = new ArrayList<>();
		Iterable<Customer> cust=customerRepository.findAll();
		for(Customer c:cust) {
			list.add(c);
			
		}
		return list;
		
	}

}
