package com.velocity.pune;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;


public class arrayListDemo6 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("shubham");
		al.add("rahul");
		al.add("laxman");
		al.add("Arun");
		al.add("krishna");
		al.add("Dilip");
		al.add("Ajay");
		al.add("punshkar");
      
		Collections.sort(al);
		System.out.println(al);
		
	}
}
