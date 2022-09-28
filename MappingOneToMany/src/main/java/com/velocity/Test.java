package com.velocity;

import java.util.HashSet;
import java.util.Set;

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
	   
	   User user=new User();
	   Policy policy1=new Policy("P1", "Car Insurance", "Active", user);
	   Policy policy2=new Policy("P2", "Helth Insurance", "Active", user);
	   Policy policy3=new Policy("P3", "Bike Insurance", "Active", user);
	   
	   Set<Policy> set=new HashSet<Policy>();
	   set.add(policy1);
	   set.add(policy2);
	   set.add(policy3);
	   
	   user.setPolicy(set);
	   user.setName("Arun");
	   user.setEmail("arun@gmail.com");
	   
	   session.save(user);
	   session.save(policy1);
	   session.save(policy2);
	   session.save(policy3);
	   
	   t.commit();
	   session.close();
	   sf.close();
	   
	   
	}
}
