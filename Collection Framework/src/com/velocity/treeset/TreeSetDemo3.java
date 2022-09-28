package com.velocity.treeset;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Sita");
		ts.add("Ram");
		ts.add("Lxamn");
		ts.add("Pune");
		ts.add("Bhagalpur");
		for(String s:ts) {
			System.out.println(s);
		}
	}
}
