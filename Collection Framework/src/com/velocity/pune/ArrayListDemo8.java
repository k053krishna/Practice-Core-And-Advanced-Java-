package com.velocity.pune;

import java.util.ArrayList;

public class ArrayListDemo8 {

	public static void main(String[] args) {
		ArrayList<Employee> arraylist=new ArrayList<Employee>();
		arraylist.add(new Employee(20,"Ram","25000"));
		arraylist.add(new Employee(30,"sohan","50000"));
		
		for (Employee emp : arraylist) {
			System.out.println(emp); //emp.toString() method called
	}
}
	}
