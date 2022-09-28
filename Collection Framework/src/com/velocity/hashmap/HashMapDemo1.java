package com.velocity.hashmap;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		HashMap hs = new HashMap();
		hs.put(10, 500);
		hs.put(20, 100);
		hs.put(30, 200);
		hs.put(55, 300);
		hs.put(null, null);
		System.out.println(hs);
		Set<Object> s = hs.keySet();
		for (Object o : s) {
			System.out.println(o);
			System.out.println("value " + hs.get(o));
		}
	}
}
