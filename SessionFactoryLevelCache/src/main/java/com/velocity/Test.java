package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
		
		public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf=configuration.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Student s1=(Student) session.load(Student.class, 1);
		System.out.println("id: " +s1.getId());
		System.out.println("name: " +s1.getName());
		System.out.println("city: " +s1.getCity());
		System.out.println("mobile: " +s1.getMobile());
		

		Student s2=(Student) session.load(Student.class, 2);
		System.out.println("id: " +s2.getId());
		System.out.println("name: " +s2.getName());
		System.out.println("city: " +s2.getCity());
		System.out.println("mobile: " +s2.getMobile());
		
		
	}
}
