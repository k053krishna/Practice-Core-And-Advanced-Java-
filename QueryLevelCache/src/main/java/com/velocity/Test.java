package com.velocity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
		
		public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf=configuration.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Query query=session.createQuery("from Student");
		
		query.setCacheable(true);
		List<Student> students=query.list();
		for(Student student:students) {
			System.out.println("Id= " +student.getId());;
			System.out.println("name= " +student.getName());
			System.out.println("City= " +student.getCity());
			System.out.println("mobile= " +student.getMobile());
		}
		session.close();
		sf.close();
		System.out.println("Record is inserted");
		
	}
}
