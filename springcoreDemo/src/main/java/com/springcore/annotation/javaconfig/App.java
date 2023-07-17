package com.springcore.annotation.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(javaConfig.class);
    	
    	Employee emp1 = (Employee) context.getBean("returnEmployee");
    	System.out.println(emp1);
    }
}
