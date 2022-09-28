package com.velocity;

public class Example {

	public static void main(String[] args) {
		System.out.println("this is first line");
		System.out.println("this is the second line");
		System.out.println("this is the third line");
		try {
			int a = 10 / 0;
		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("this is the fourth line");
		System.out.println("this is the fifth line");
	}
}
