package com.velocity;

public class EvenOddArray {

	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Even number in a array is ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("ood number in a array is ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
	}
}
