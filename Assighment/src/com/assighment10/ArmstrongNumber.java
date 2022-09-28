package com.assighment10;

import java.util.Scanner;

public class ArmstrongNumber {

	public boolean getArmstrongNumber(int input) {
		int tempvalue = input;
		int sum = 0;
		while (input != 0) {
			int remender = input % 10;
			sum = sum + (remender * remender * remender);
			input = input / 10;
		}
		if (sum == tempvalue)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if (armstrongNumber.getArmstrongNumber(num))
			System.out.println(num + " is a armstrong number");
		else
			System.out.println(num + " is not a armstrong number");
	}
}
