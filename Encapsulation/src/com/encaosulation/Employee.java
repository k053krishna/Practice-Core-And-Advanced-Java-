package com.encaosulation;

public class Employee {
	private int salary;

	public void setSallery(int sal) {
		if (sal > 0) {
			salary = sal;
		} else {
			salary = 0;

		}
	}//Degine a method getSallery 
	//which return Sallery to that mathod
	public int getsalary() {
		return salary;
		
	}
}
