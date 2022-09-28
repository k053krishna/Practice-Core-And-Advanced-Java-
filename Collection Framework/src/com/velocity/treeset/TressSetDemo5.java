package com.velocity.treeset;

import java.util.TreeSet;

public class TressSetDemo5 {

	public static TreeSet getTreeSetDemo() {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(22);
		ts.add(64);
		ts.add(46);
		ts.add(78);
		ts.add(53);
		return ts;
	}
	public static void main(String[] args) {
		TreeSet treeset=getTreeSetDemo();
		System.out.println(treeset);
	}
}
