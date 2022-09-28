package com.velocity.hashmap.combinationProgramm;

import java.util.HashMap;

public class HashMapDemo3 {

	//can we take custom Employee class as key in HashMap? yes
	
	public static void main(String[] args) {
		HashMap<Employee, String> hs=new HashMap<Employee,String>();
		
		Employee emp=new Employee();
		// employee object as key and name as value
		hs.put(emp, emp.getSalary());
		System.out.println(hs.get(emp));
	}
}
