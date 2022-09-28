package com.velocity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext ac=new ClassPathXmlApplicationContext("spring.xml");
		Student student=(Student) ac.getBean("s");
		student.getDiplayMessage("velocity tranning center");
	}
}
