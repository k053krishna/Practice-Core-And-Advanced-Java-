package com.velocity;

public class StringDemo3 {

	public static void main(String[] args) {
		String s1="velocity";
		String s2=new String("pune");
		s1=s2;
		System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	}
}
