package com.velocity.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo3 {

	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(15);
		hs.add(20);
		hs.add(25);
		hs.add(40);
		
		for(Integer i:hs) {
		System.out.println(i);
		}
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
