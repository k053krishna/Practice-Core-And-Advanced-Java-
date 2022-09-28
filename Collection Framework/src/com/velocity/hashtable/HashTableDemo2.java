package com.velocity.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo2 {

	public static void main(String[] args) {

		Hashtable<String, String> hs = new Hashtable<String, String>();
		hs.put("Ram", "Laxman");
		hs.put("Sita", "Ram");
		hs.put("Radha", "Krishna");
		// System.out.println(hs);
		Set<String> s = hs.keySet();
		Iterator<String> itr = s.iterator();
		while (itr.hasNext()) {
			String str = itr.next();
			System.out.println("Key is..." + str);
			System.out.println("Value is..." + hs.get(str));
		}
	}
}
