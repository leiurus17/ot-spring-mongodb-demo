package com.example.demo.hello;

import org.springframework.data.annotation.Id;

public class Customer {
	
	@Id
	public String id;
	
	public String firstName;
	public String lastName;
	public Address address;
	
	public Customer() {
		
	}
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Customer(String firstName, String lastName, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public String toString() {
		return String.format(
				"Customer[id=%s, firstName='%s', lastName='%s']",
				id, firstName, lastName);
				
	}
	
	
	

}
