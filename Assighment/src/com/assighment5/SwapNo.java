package com.assighment5;

public class SwapNo {
	public static void main(String[] args) {
		int a = 90;
		int b = 75;
		int temp;
		System.out.println(" Before swap ");
		System.out.println(" a = " + a + " & " + " b = " + b);
		// a = a + b;
		// b = a - b;
		// a = a - b;
		temp = a;
		a = b;
		b = temp;
		System.out.println(" after swap ");
		System.out.println(" a = " + a + " & " + " b = " + b);

	}
}
