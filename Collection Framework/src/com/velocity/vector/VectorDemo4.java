package com.velocity.vector;

import java.util.Vector;

public class VectorDemo4 {

	public static void main(String[] args) {
		Vector<String> vector=new Vector<String>();
		vector.add("sohan");
		vector.add("velocity");
		vector.add("pune");
		vector.add("mumbai");
		while(vector.contains("pune")) {
			vector.remove("pune");
		}
		System.out.println("new vecto is " +vector);
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector.get(1));
		
	}
}
