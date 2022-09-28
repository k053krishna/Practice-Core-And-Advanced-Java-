package com.velocity.hashset;

import java.util.HashSet;

public class HashsetDemo2 {

	public static void main(String[] args) {
		//print the data by using for each loop
		HashSet hs =new HashSet();
		hs.add(10);
		hs.add(25);
		hs.add(15);
		hs.add(30);
		
		for(Object o:hs) {
			System.out.println(o);
		}
	}
}
