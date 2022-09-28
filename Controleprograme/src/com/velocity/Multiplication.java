package com.velocity;

import java.util.Scanner;

public class Multiplication {

	public void getMutiolication(int no) {
		for (int i = 1; i <= 10; i++) {
			int c = i * no;
			System.out.println(no + "*" + i + "=" + c);
		}
	}

	public static void main(String[] args) {
		System.out.println("enter a NO");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Multiplication multipication = new Multiplication();
		multipication.getMutiolication(number);

	}
}
