package com.velocity.hashtable;

import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo3 {

	public static void main(String[] args) {
		Hashtable<Integer, String> hs = new Hashtable<Integer, String>();
		hs.put(10, "Atul");
		hs.put(15, "Arun");
		hs.put(35, "Vikash");
		hs.put(25, "Bhivash");

		Set<Integer> s = hs.keySet();

		for (Integer i : s) {
			System.out.println("Key " + i);
			System.out.println("Value " + hs.get(i));
		}
	}
}
