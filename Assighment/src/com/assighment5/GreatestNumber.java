package com.assighment5;
/* write a program to check whether year is 
leap year or not. 
 (If else stmt). */

public class GreatestNumber {
	public static void main(String[] args) {
		int a = 20;
		int b = 40;
		int c = 70;
		if (a > b && a > c) {
			System.out.println("a is greater");
		} else if (b > a && b > c) {
			System.out.println("b is greater");
		} else if (c > a && c > b) {
			System.out.println("c is greater");
		} else {
			System.out.println("invailed input");
		}
	}
}
