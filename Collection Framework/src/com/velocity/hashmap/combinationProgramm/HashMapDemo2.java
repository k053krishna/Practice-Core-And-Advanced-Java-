package com.velocity.hashmap.combinationProgramm;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapDemo2 {

	//How to return map to method- to make loosly coupled
	public Map getHashMapDemo() {
		Map map=new TreeMap();
		map.put(10, "Rakesh");
		map.put(23, "Krishna");
		map.put(24, "soshan");
		return map;
	}
	public static void main(String[] args) {
		HashMapDemo2 hs=new HashMapDemo2();
		Map m=hs.getHashMapDemo();
		System.out.println(m);
	}
}
