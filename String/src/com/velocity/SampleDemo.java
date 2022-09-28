package com.velocity;

public class SampleDemo {

	public static void main(String[] args) {
		String str = "velocity corporate trenning center in pune ";
		int count = 0;
		for (int i = 1; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ' ') {
				count++;
			}
		}
		System.out.println("total number of space in a string are..." + count);
	}
}
