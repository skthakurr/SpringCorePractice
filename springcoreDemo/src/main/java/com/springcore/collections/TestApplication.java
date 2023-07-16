package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApplication {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		
		Student std= (Student) context.getBean("student1");
		System.out.println(std);
	}
}
