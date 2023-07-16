package com.springcore.springcoreDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	
    	Employee emp1 = (Employee) context.getBean("employee1");
    	Employee emp2 = (Employee) context.getBean("employee2");
    	System.out.println(emp1);
    	System.out.println(emp2);
    }
}
