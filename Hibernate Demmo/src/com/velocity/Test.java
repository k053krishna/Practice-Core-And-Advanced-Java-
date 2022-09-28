package com.velocity;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {


	public static void main(String[] args) {

		System.out.println("1");
	
		Configuration configuration = new Configuration();
		
		System.out.println("2");
		configuration.configure("hibernate.cfg.xml");

		System.out.println("3");

		SessionFactory sf = configuration.buildSessionFactory();

	
		Session s = sf.openSession();
		
	
		Transaction t=s.beginTransaction();
		
		Student student=new Student();
		student.setFirstName("ram");
		student.setLastName("pawar");
		student.setCity("pune");
		
		
		s.save(student); //insert query fire
	
		s.close();
		sf.close();
		System.out.println("Record is added successfully...");
	}
}

