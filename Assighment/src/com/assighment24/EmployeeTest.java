package com.assighment24;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
		al.add(new Employee(101,"Krishna", "Pune"));
		al.add(new Employee(105,"Roshan", "Bihar"));
		al.add(new Employee(108,"Santosh Kumar", "Bamglore"));
		al.add(new Employee(103,"Arun", "Mumbai"));
		al.add(new Employee(103,"Lalu", "Bangal"));
		
		Collections.sort(al);
		for(Employee emp:al) {
			System.out.println(emp);
			
		}
	}
}
