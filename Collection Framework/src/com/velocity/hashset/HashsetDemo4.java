package com.velocity.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo4 {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("Ram");
		hs.add("Sita");
		hs.add("Laxman");
		
		for(String s:hs) {
			System.out.println(s);
		}
		Iterator itr=hs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
