package com.velocity.hashset;

import java.util.HashSet;

public class HashsetDemo5 {

	public static HashSet getHashSetDemo() {
		 HashSet sh=new HashSet();
		 sh.add(10);
		 sh.add(20);
		 sh.add(30);
		 sh.add(40);
		 return sh;
	}
	public static void main(String[] args) {
		HashSet hashset=getHashSetDemo();
		System.out.println(hashset);
	}
}
