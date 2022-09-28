package com.velocity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext al=new ClassPathXmlApplicationContext("spring.xml");
		Student stud=(Student) al.getBean("s");
		stud.getStudentData();
	}
}
