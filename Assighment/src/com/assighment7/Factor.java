package com.assighment7;

import java.util.Scanner;

public class Factor {
	public static void getFactor(int no) {
		int i = 1;
		while (i <= no) {
			if (no % i == 0) {
				System.out.println("Factor of number is >>>" +i);
			}
			i++;
		}
	}

	public static void main(String[] args) {
		System.out.println("enter the no>>");
		Scanner scanner =new Scanner(System.in);
		int number=scanner.nextInt();
		getFactor(number);
		//System.out.println("factor of number is>>" +number);
	}
}
