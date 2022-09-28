package com.test;

public class Chaining {

	public Chaining() { //non parameterized constructor
		this(5);
	}

	public Chaining(int x) {//Parameterized constructor with int 
		this("java");
		System.out.println(x);

	}

	public Chaining(String str) { //Parameterize constructor with String
		System.out.println(str);
	}

	public static void main(String[] args) {
		Chaining chaining = new Chaining();
	}
}
