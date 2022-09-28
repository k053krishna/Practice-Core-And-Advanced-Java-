
package com.assighment5;

import java.util.Scanner;

/*Write a program to print square of any number */
public class Square {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner =new Scanner(System.in);
		int i=scanner .nextInt();
		//int i = 11;
		int c = i * i;
		System.out.println("square of num is " + c);
	}

}
