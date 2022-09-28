package com.velocity.hashset;

import java.util.HashSet;

public class HashsetDemo1 {

	public static void main(String[] args) {
		
		HashSet hs=new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(20);//Duplicate add
		hs.add("Ram");//Heterogeneous element add
		hs.add(null);//null insertion is possible
		System.out.println(hs);
	}
}
