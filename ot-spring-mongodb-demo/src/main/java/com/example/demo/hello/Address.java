package com.example.demo.hello;

public class Address {
	
	public String homeNumber;
	public String streetName;
	
	public Address(String homeNumber, String streetName) {
		this.homeNumber = homeNumber;
		this.streetName = streetName;
	}
	public String getHomeNumber() {
		return homeNumber;
	}
	public void setHomeNumber(String homeNumber) {
		this.homeNumber = homeNumber;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	
	
	
}
