package com.velocity;

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
			Transaction transaction = session.beginTransaction();

			Student student= (Student)session.get(Student.class, 1);
			student.setName("Madan");
			student.setCity("USA");
			student.setMobile("0214567894");
			
			session.update(student);
			//session.close();
			//sessionFactory.close();
			transaction.commit();
			System.out.println("Record is updated sucessfully");
		}
	}

