package com.velocity.hashmap.combinationProgramm;

import java.util.HashMap;

public class HashMapDemo1 {

	// How to return map to method-
	public HashMap<Integer, String> getHashMapDemo() {
		HashMap<Integer, String> hs = new HashMap<Integer, String>();
		hs.put(10, "RAm");
		hs.put(25, "Shayam");
		hs.put(35, "Mohan");
		return hs;
	}

	public static void main(String[] args) {
		HashMapDemo1 hmap = new HashMapDemo1();
		HashMap hashMap = hmap.getHashMapDemo();
		System.out.println(hashMap.toString());
	}
}
