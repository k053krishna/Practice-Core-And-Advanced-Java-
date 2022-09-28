package com.velocity.pune;

import java.util.ArrayList;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("10");
		al.add("20");
		al.add("30");
		
		for(String str:al) {
			System.out.println(str);
		}
	}
}
