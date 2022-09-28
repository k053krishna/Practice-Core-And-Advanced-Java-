package com.assighment7;

import java.util.Scanner;

public class RevNumber {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		/*
		int reverse = 0;

		while (num != 0) {
			reverse = reverse * 10;
			reverse = reverse + num % 10;
			num = num / 10;
		}
		*/
		/*
		//StringBuffer reverse;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer reverse=sb.reverse();
		System.out.println(reverse);
		*/
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		StringBuilder reverse=sbl.reverse();
		System.out.println(reverse);
		
	}

}
