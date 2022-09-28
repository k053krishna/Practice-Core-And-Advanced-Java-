package com.assighment20;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee(10, "Krishna", "50000", "pune"));
		al.add(new Employee(20, "Arun", "60000", "mumbai"));
		Iterator<Employee> itr = al.iterator();
        System.out.println("Using iterator");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("Using for each loop");
		for (Employee emp : al) {
			System.out.println(emp);
		}
		System.out.println("Using direct way");
		System.out.println(al);
	}

}
