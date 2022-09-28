package com.velocity.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo4 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("mumbai");
		ts.add("pune");
		ts.add("Banglore");
		ts.add("Delhi");
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
