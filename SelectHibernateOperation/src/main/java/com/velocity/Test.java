package com.velocity;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
		
		public static void main(String[] args) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			SessionFactory sessionFactory = configuration.buildSessionFactory();
			Session session = sessionFactory.openSession();
			
			Query query=session.createQuery("from Student");//poso class name is Student
			List<Student> students= query.list();
			for( Student student:students) {
				System.out.println("id= " +student.getId());
				System.out.println("name= " +student.getName());
				System.out.println("city= " +student.getCity());
				System.out.println("mobile number= " +student.getMobile());
			}
			session.close();
			sessionFactory.close();
		    
			System.out.println("Record is updated sucessfully");
		}
	}

