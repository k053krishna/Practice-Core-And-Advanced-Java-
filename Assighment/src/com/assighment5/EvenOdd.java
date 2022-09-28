package com.assighment5;

import java.util.Scanner;

/*Write a program to check whether number is even or 
odd. */

public class EvenOdd {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();

		if (i % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	}
}
