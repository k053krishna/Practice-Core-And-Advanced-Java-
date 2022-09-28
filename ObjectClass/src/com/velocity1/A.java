package com.velocity1;

public class A implements Cloneable {
	int x;


	public static void main(String[] args) throws CloneNotSupportedException {
		A a = new A();
		a.x = 50;

		System.out.println("first objet is >>" + a.x);
		Object a1 = a.clone();
		System.out.println("second object is >> " + a1.toString());

	}


	@Override
	public String toString() {
		return "A [x=" + x + "]";
	}
	
}
