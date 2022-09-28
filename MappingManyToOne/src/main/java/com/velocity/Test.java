package com.velocity;

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
		
		Employeee emp1=new Employeee();
		emp1.setName("Ram");
		emp1.setEmail("ram@gmail.com");
		
		Employeee emp2=new Employeee();
		emp2.setName("Laxman");
		emp2.setEmail("laxman@gmail.com");
		
		Address address1=new Address();
		address1.setCity("Pune");
		address1.setState("maharastra");
		address1.setCountry("India");
		address1.setPincode("813222");
		
		emp1.setAddress(address1);
		emp2.setAddress(address1);
		
		session.save(emp1);
		session.save(emp2);
		t.commit();
		session.close();
		sf.close();
		
	}
}
