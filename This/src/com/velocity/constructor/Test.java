package com.velocity.constructor;

public class Test {
	
	public Test() {
		System.out.println("this is first constructor");
	}
public Test(int a) {
	this();
}
	public static void main(String[] args) {
		Test test = new Test(20);
		
	}
}
