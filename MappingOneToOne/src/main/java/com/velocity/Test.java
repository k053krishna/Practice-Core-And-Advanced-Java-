package com.velocity;


import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		
		Customer customer=new Customer();
		customer.setFirstName("Vikash");
		customer.setMobileNumber("7898654598");
		
		Transection transection=new Transection();
		transection.setDate(new Date());
		transection.setTotal(5000);
		
		customer.setTransection(transection);
		session.save(customer);
		t.commit();
	
	}
}
