package com.velocity.treeset;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();
		ts.add(10);
		ts.add(25);
		ts.add(20);
		ts.add(40);
		ts.add(45);
		ts.add(20);// duplicate not allowed
		// ts.add("Sita")//Hatrogeneous not allow
		//we will get class cast Exception
		// ts.add(null);
		//we will get null pointer exception
		System.out.println(ts);
	}
}
