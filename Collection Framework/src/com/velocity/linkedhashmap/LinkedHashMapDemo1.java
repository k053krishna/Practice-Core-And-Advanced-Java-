package com.velocity.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo1 {

	public static void main(String[] args) {
		
		LinkedHashMap hm=new LinkedHashMap();
		hm.put(10, "Krishna");
		hm.put(20, "dilip");
		hm.put(44, "Rahul");
		hm.put(35, "Niraj");
		hm.put(null, null);
		System.out.println(hm);
		
	}
}
