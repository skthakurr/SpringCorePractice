package com.springcore.annotation.javaconfig;

import org.springframework.stereotype.Component;

//@Component
public class Employee {
	private int empId;
	private String empName;
	private String empCity;
	private double salary;
	
	public Employee() {
	}
	
	public Employee(int empId, String empName, String empCity, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
		this.salary = salary;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + ", salary=" + salary
				+ "]";
	}
	
}
