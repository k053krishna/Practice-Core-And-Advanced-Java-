package com.superandsubclass;

public class Base {
	String name;

	public Base() {
		this("");
		System.out.println("No argument constructor of base class");
	}

	public Base(String name) {
		this.name = name;
		System.out.println("calling parameterized constructor of base class..");
	}

}
