package com.springcore.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired //byType injection
	private Address address;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired constructor injection
	public Emp(Address address) {
		super();
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}
	//@Autowired setterInjection
	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}



	
}
