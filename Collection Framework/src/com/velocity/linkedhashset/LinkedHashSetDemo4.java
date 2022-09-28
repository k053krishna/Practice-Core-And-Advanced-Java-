package com.velocity.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo4 {

	public static LinkedHashSet<Integer> getLinkedHashSet() {
	LinkedHashSet <Integer> lhs= new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(25);
		lhs.add(35);
		lhs.add(40);
		return lhs;
	}
	
	public static void main(String[] args) {
		LinkedHashSet linkhs=getLinkedHashSet();
		System.out.println(linkhs);
	}
}
