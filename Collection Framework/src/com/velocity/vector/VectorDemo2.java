package com.velocity.vector;

import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) {
		Vector<String> vector =new Vector<String>();
		vector.add("Ram");
		vector.add("Laxman");
		vector.add("Sita");
		//for each loop
		for(String s:vector) {
		System.out.println(s);
		}
	}
}
