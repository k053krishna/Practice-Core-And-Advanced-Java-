package com.velocity.vector;

import java.util.Vector;

public class VectorDemo1 {

	public static void main(String[] args) {
		Vector vector = new Vector();
		for (int i = 1; i <= 10; i++) {
			vector.addElement(i);
			System.out.println(i);
		}
		System.out.println(vector.capacity());
		vector.add("j");
		System.out.println(vector);
		System.out.println(vector.capacity());

	}
}
