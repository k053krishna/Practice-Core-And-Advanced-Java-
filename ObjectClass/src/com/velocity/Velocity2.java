package com.velocity;

// create the copy of objects
public class Velocity2 implements Cloneable {
	@Override
	public String toString() {
		return "Velocity2 [x=" + x + "]";
	}

	int x;

	public static void main(String[] args) throws CloneNotSupportedException {
		Velocity2 velocity2 = new Velocity2();
		velocity2.x = 50;
		System.out.println("first object is>> " + velocity2.x);
		Object velocity3 = velocity2.clone();
		System.out.println("second object is >> "+ velocity3.toString());
	}
	

}
