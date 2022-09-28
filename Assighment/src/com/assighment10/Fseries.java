package com.assighment10;

import java.util.Scanner;

public class Fseries {
	public static void main(String[] args) {
		System.out.println("Enter the no");
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		int value1 = 0;

		int value2 = 1;

		for (int i = 1; i <= no; i++) {
			System.out.print(value1 + ",");
			int temp = value1;
			value1 = value1 + value2;
			value2=temp;

		}

	}
}
