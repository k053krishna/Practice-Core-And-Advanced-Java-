package com.assighment7;

import java.util.Scanner;

public class Practice {
	public static void getCharType(int ch) {
		if (ch >= 65 && ch <= 90) {
			System.out.println("it is capital latter");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("it is small latter");
		} else if (ch >= 48 && ch <= 57) {
			System.out.println("it is digit");
		} else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96)
				|| (ch >= 123 && ch <= 126)) {
		} else
			System.out.println("incorrect input");
	}
	public static void main(String[] args) {
		System.out.println("enter the value>>>");
		Practice practice =new Practice();
		Scanner scanner =new Scanner(System.in);
		int ch=scanner.next().charAt(0);
		getCharType(ch);
	}
}
