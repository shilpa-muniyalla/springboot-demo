package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {

}
