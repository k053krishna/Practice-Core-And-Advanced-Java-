package com.superandsubclass;

public class Derived extends Base{
	Derived() {
		System.out.println("no argument constructor of derive class");
	}

	Derived(String name) {
		super(name);
		System.out.println("calling parameterized constructor of derived class");
	}

	public static void main(String[] args) {
		Derived derived = new Derived("test");
	}
}
