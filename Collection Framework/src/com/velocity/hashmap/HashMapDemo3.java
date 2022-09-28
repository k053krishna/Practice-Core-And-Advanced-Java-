package com.velocity.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String, String>();
		hs.put("Krishna", "Yadav");
		hs.put("radhe", "Shayam");
		hs.put("Shayam", "Babu");

		Set<String> s = hs.keySet();
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println("Key.. " + str);
			System.out.println("Value.. " + hs.get(str));
		}
	}
}
