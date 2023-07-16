package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRefApplication {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		Computer cmp = (Computer) context.getBean("computer");
		
		System.out.println(cmp);
		System.out.println(cmp.getHardDrive().getHardDrive1());
	}
}
