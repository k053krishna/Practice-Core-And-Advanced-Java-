package com.velocity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		Configuration configuration =new Configuration();
		configuration.configure("hibernate.cfg.xml");

          SessionFactory sf=configuration.buildSessionFactory();
          Session session=sf.openSession();
          Transaction t=session.beginTransaction();
          
          Customer customer=new Customer();
          customer.setName("sagar");
          customer.setCity("BBSR");
          customer.setAge(29);
          
          session.save(customer);
          t.commit();
          session.close();
          sf.close();
          System.out.println("Record is saved sucessfully");
	}
}
