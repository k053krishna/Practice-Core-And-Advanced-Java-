package com.velocity.hashtable;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {
	
		Hashtable hs=new Hashtable();
		hs.put(40, "Ram");
		hs.put(20, "Shayam");
		hs.put(23, "Mohan");
		hs.put("r",null);//error
		
		System.out.println("Data is..." +hs);
	}
}
