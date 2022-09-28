package com.assighment6;

import java.util.Scanner;

/*
Design method void multiplication (int no) and print 
the multiplication table. 
(Example enter the no=5 then output like 
5*1=5.......5*10=50)
*/
public class Multiplication {
	static void multiplication(int no) {
		for (int i = 1; i <= 10; i++) {
			int c = no * i;
			System.out.println(no + "*" + i + '=' + c);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int result = scanner.nextInt();
		multiplication(result);

	}
}
