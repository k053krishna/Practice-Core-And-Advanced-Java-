package com.velocity.treeset;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(23);
		ts.add(34);
		ts.add(22);
		ts.add(45);
		ts.add(54);
		for(Integer i:ts) {
			System.out.println(i);
		}
	}
}
