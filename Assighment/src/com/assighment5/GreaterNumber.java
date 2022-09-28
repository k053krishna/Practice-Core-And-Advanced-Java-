package com.assighment5;

import java.util.Scanner;

/*Write the program to check whether the no is 
greater than 100. */

public class GreaterNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int i=scanner.nextInt();
		//int i = 13;
		if (i > 100) {
			System.out.println("number is greater then 100");
		} else {
			System.out.println("number is less then 100");
		}
	}
}
