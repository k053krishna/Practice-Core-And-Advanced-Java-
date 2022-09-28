package com.velocity;

public class StringDemo7 {

	public static void main(String[] args) {
		String s1="VELOCITY";
		String s2="velocity";
		s1=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
	}
}
