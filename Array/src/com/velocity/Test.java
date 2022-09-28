package com.velocity;

public class Test {
	public static void main(String[] args) {
		int a[] = new int[5];// declaration &instantiation
		a[0] = 10;// this is called as Initialization
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		// how to iterate array or how to traverse array
		// how to calculate the length of array. 5
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
