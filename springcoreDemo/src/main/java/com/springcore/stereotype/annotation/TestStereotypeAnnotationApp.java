package com.springcore.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereotypeAnnotationApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/stereotype/annotation/stereoconfig.xml");
		//System.out.println(context.getBean("myCar",Car.class));
//		System.out.println(context.getBean("myCar",Car.class).hashCode());
//		System.out.println(context.getBean("myCar",Car.class).hashCode());
		
		
		System.out.println(context.getBean("truck1"));
		System.out.println(context.getBean("truck1").hashCode());
		System.out.println(context.getBean("truck1").hashCode());
	}

}
