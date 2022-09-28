package com.velocity.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(101, "Ram", 9000));
		al.add(new Employee(102, "ashok", 3000));
		al.add(new Employee(103, "ajay", 8000));

		Collections.sort(al);
		for (Employee emp : al) {
			// System.out.println("id..." + emp.getId()+ "name " + emp.getName() +"salary "+
			// emp.getSalary());
          System.out.println(emp);
		}
	}
}
