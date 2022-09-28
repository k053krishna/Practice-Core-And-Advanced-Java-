package com.velocity.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer,String > hs=new HashMap<Integer,String>();
		hs.put(10, "Krishna");
		hs.put(20, "pune");
		hs.put(30, "Mumbai");
		hs.put(05, "Banglore");
		
		Set<Integer> s=hs.keySet();
		
		for(Integer i:s) {
			System.out.println(i);
			System.out.println(hs.get(i));
		}
	}
}
