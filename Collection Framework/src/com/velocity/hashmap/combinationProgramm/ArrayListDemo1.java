package com.velocity.hashmap.combinationProgramm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(70);
		al.add(30);
		al.add(90);
		al.add(50);
		al.add(20);
		System.out.println("Before shorting>>" +al);
		Collections.sort(al);
		System.out.println("After shorting>>" +al);
		
	}
}
