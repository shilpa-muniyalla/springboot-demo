//pojo - it has variables getters and setters

package com.example.demo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class User {
	
	private String firstName;
	private String lastName;
	private String age;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public String getAge() {
		return age;
	}
	
	public void setAge(String age) {
		this.age=age;
	}
	
	public int getid() {
		return id;
	}
	
	public void setid(int id) {
		this.id=id;
	}

}
