package com.velocity;

public class Velocity1 {
	public static void main(String[] args) {
		Velocity1 velocity1 = new Velocity1();

		System.out.println(velocity1.hashCode());
		
		Velocity1 velocity2 = new Velocity1();

		System.out.println(velocity2.hashCode());
	}
}
