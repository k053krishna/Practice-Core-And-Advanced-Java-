package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf = configuration.buildSessionFactory();
		Session session = sf.openSession();
		Transaction t = session.beginTransaction();

		User user1 = new User();
		user1.setName("vikash");
		user1.setEmail("vikash@email.com");

		User user2 = new User();
		user2.setName("krishna");
		user2.setEmail("krishna@gmail.com");

		Nominee nominee = new Nominee();
		nominee.setName("sagar");

		Nominee nominee1 = new Nominee();
		nominee.setName("santosh");

		Nominee nominee2 = new Nominee();
		nominee2.setName("shubham");

		user1.getNomineeList().add(nominee);
		user1.getNomineeList().add(nominee1);
		user1.getNomineeList().add(nominee2);

		nominee.getUserList().add(user1);
		nominee1.getUserList().add(user1);
		nominee2.getUserList().add(user1);

		user2.getNomineeList().add(nominee1);
		user2.getNomineeList().add(nominee2);

		nominee1.getUserList().add(user2);
		nominee2.getUserList().add(user2);
		
		session.persist(user1);
		session.persist(user2);
		
		t.commit();
		session.close();
		sf.close();
	}

}
