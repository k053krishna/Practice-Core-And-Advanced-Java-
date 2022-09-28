package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
		
		public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		
		configuration.configure("hibernate.cfg.xml");
		
		SessionFactory sf=configuration.buildSessionFactory();
		
		Session session=sf.openSession();
		
		Transaction t=session.beginTransaction();
		
		
		Student s1=new Student();
		s1.setName("Ram");
		s1.setCity("Pune");
		s1.setMobile("8767564398");
		
		t.commit();
		//session.evict(s1);
		session.save(s1);
		System.out.println("Record is insertated");
		
		
	}
}
