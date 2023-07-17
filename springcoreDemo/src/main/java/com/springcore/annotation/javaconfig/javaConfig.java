package com.springcore.annotation.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.springcore.annotation.javaconfig")
public class javaConfig {
	
	@Bean
	public Employee returnEmployee(){
		
		Employee emp = new Employee();
		return emp;
		
	}
}
