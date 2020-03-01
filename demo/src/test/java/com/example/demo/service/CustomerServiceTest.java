package com.example.demo.service;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.dao.CustomerRepository;
import com.example.demo.domain.Customer;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {
	
	@InjectMocks
	CustomerService customerService;
	
	@Mock
	CustomerRepository customerRepository;
	
	@Mock
	Customer customer;
	
	@Test
	public void testCustomerServive() {
		
	
		Mockito.when(customerRepository.findById(Mockito.anyInt())).thenReturn(Optional.of(customer));
		customerService.getCustomer(2);
		Mockito.verify(customerRepository,Mockito.times(1)).findById(2);
	}

}
