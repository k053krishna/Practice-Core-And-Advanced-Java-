package com.velocity.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet linkHset=new LinkedHashSet();
		linkHset.add(10);
		linkHset.add(25);
		linkHset.add(15);
		linkHset.add(10);//duplicate not allowed
		linkHset.add(35);
		linkHset.add(null);//null insertion is possible
		linkHset.add("Ram");//Heterogeneous element allow
		System.out.println(linkHset);
	}
}
