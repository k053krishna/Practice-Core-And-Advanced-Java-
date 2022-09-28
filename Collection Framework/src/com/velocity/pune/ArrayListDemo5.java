package com.velocity.pune;

import java.util.ArrayList;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("pune");
		al.add("mumbai");
		al.add("banglore");
		al.add(20);
		System.out.println(al.get(1));
		System.out.println(al);
		System.out.println(al.remove("banglore"));
		System.out.println("After removing element ..." +al);
		System.out.println(al.contains("pune"));
		System.out.println(al);
	}
}
