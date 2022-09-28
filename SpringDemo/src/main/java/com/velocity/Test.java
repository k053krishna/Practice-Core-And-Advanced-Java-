package com.velocity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		

		ApplicationContext ap=new ClassPathXmlApplicationContext("spring.xml");
		
		Student stud=(Student)ap.getBean("s"); //getBean() method is invoked
		
		System.out.println("Student data is >>"+stud); 
	}
}
