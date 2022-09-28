package com.velocity.pune;

import java.util.ArrayList;

public class ArrayMethod {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(3);
		al.add(6);
		al.add(0,22 );
		ArrayList<Integer> al1=new ArrayList<Integer>();
		al1.add(5);
		al1.add(2);
		al1.add(7);
		al1.add(9);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		//System.out.println(al.contains(2));
		//System.out.println(al.indexOf(1));
		System.out.println(al.lastIndexOf(3));
		
		//for(int i=0;i<al.size();i++) {
		//	System.out.println(al.get(i));
			al2.addAll(al);
			al2.addAll(al1);
			System.out.println(al2);
			
		}
	}

