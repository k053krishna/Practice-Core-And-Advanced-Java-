package com.assighment10;
/*Write java program to check whether number is prime or not(Prime 
number
* means which is divisible by two numbers only i.e. 1 and itself 
only.
*/

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a number>>>");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int count = 0;
		for (int i = num; i > 0; i--) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count <= 2) {
			System.out.println("number is a prime number");
		} else {
			System.out.println("number is not a prime number");
		}

	}
}
