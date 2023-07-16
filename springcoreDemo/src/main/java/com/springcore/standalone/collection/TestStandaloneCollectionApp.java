package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandaloneCollectionApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/standalone/collection/saloneconfig.xml");
		Person person = context.getBean("person1",Person.class);
		Person person1 = context.getBean("person2",Person.class);
		System.out.println(person);
		System.out.println(person1);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person1.getCource().getClass().getName());
	}

}
