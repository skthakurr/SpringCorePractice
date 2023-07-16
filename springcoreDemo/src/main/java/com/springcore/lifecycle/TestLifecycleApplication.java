package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifecycleApplication {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/lifecycle/config.xml");
		//Registering shutdown hook to call destroy method for code cleanup
		
		context.registerShutdownHook();
		Product product= (Product) context.getBean("product1");
		System.out.println(product);
		
		System.out.println("-------------------------------------------------------");
		Payment payment = (Payment) context.getBean("payment1");
		
		System.out.println(payment);
		System.out.println("-------------------------------------------------------");
		Phone phone=  (Phone) context.getBean("phone1");
		System.out.println(phone);
		
		

	}

}
