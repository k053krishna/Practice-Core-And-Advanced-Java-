package com.velocity.vector;

import java.util.Vector;

public class VectorDemo3 {

	// Design method which return vector object
		public static Vector getVectorData() {
			Vector vector= new Vector();
			vector.add(10);
			vector.add(20);
			vector.add(30);
			return vector;
		}
		public static void main(String[] args) {
		Vector v=getVectorData();
		System.out.println(v);
		}
}
