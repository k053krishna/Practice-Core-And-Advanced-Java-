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

		Student student= new Student();
		student.setName("Dinesh");
		student.setCity("Dubai");
		student.setMobile("3456787654");
		
		session.save(student);
		session.close();
		transaction.commit();
		System.out.println("Record is inserted sucessfully");
	}
}
