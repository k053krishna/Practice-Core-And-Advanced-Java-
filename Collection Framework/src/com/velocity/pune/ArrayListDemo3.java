package com.velocity.pune;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		for(int i:al) {
			System.out.println("Array is " +i);
		}
	}
}
