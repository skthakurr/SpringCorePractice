package com.springcore.ci;

import java.util.List;

public class Person {
	private String name;
	private int personId;
	private Certificate cirtificate;
	private List<String> phone;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int personId, Certificate certificate, List<String> phone) {
		super();
		this.name = name;
		this.personId = personId;
		this.cirtificate = certificate;
		this.phone=phone;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", personId=" + personId + ", cirtificate=" + cirtificate + ", phone=" + phone
				+ "]";
	}
	
	
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public int getPersonId() {
//		return personId;
//	}
//	public void setPersonId(int personId) {
//		this.personId = personId;
//	}
	
	
	
	
}
