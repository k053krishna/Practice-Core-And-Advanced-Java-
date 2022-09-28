package com.velocity1;

public class B {

	int empId;
	String empName;

	public static void main(String[] args) {
		B b = new B();
		b.empId = 10;
		b.empName = "kri";
		
		B b1=new B();
		b1.empId=20;
		b1.empName="moni";
		
		b=b1;
		System.out.println(b.equals(b1));
		
	}
}
