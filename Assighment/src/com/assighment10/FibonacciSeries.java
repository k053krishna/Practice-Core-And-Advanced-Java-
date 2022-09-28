package com.assighment10;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number>>");
		int input = scanner.nextInt();
		int value1 = 0;
		int value2 = 1;
		for (int i = 1; i <= input; i++) {
		System.out.print(value1 + ",");
		int temp = value1;
		value1 = value1 + value2;
		value2 = temp;
	
		}
		}
		}

