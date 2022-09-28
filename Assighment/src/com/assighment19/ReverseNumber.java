package com.assighment19;

import java.util.Scanner;

public class ReverseNumber {

	public static String getReverseNumber(String str) {
		String reverse = "";
		for (int i =str.length()-1; i >=0; i--) {
			reverse = reverse +str.charAt(i);
		}
		return reverse;
	}

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		String result = getReverseNumber(s);
		System.out.println("reverse number is " + result);
	}
}
