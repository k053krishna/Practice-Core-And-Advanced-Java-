package com.velocity;

public class Test {
	int empid;
	String empName;

	public static void main(String[] args) {
		Test test = new Test();
		test.empid=10;
		test.empName="krishna";
		
		Test test1 = new Test();
		test.empid=20;
		test.empName="Arun";
	    test1= test;
		System.out.println(test.equals(test1));
	}
}
