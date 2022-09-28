package com.velocity.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo2 {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
		lhs.add(10);
		lhs.add(15);
		lhs.add(25);
		lhs.add(30);
		
		for(Integer i:lhs) {
			System.out.println(i);
		}
	}
}
