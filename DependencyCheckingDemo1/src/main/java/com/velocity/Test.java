package com.velocity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		Employee emp=(Employee) ap.getBean("e");
	    emp.getEmployeeData();
	}
}