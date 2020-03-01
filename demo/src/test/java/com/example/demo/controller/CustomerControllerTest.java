package com.example.demo.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.demo.service.CustomerService;

@RunWith(MockitoJUnitRunner.class)
public class CustomerControllerTest {
	
	@InjectMocks
	CustomerController customerController;
	
	@Mock
	CustomerService customerService;
	
	@Test
	public void testGetCustomer() {
	customerController.getCustomer(2);
	Mockito.verify(customerService,Mockito.times(1)).getCustomer(2);

}
}
