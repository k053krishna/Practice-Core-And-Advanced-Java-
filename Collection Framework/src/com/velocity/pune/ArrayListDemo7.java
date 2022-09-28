package com.velocity.pune;

import java.util.ArrayList;

public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		ArrayList<Integer> al1= new ArrayList<Integer>();
		al1.add(40);
		al1.add(50);
		al1.add(60);
		
		ArrayList<Integer> al2 =new ArrayList<Integer>();
		al2.addAll(al);
		al2.addAll(al1);
		System.out.println(al2);
	}
}
