package com.velocity.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapDemo2 {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
		lm.put(10, "Kri");
		lm.put(12, "Roshan");
		lm.put(20, "Rakesh");
		Set<Integer> s = lm.keySet();
		for (Integer i : s) {
        System.out.println(i);
        System.out.println(lm.get(i));
		}
	}
}
