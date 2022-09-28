package com.multiplication;

import java.util.Scanner;

public class Test {
	public  void getMultiplication(int no) {
		for (int i = 1; i <= 10; i++) {
			int c = no * i;
			System.out.println(no+ "*"+ i  +"=" +c);
		}

	}
	public static void main(String[] args) {
		System.out.println("Enter the no>>");
		Test test=new Test();
		Scanner scanner=new Scanner(System.in);
		int mul=scanner.nextInt();	
		test.getMultiplication(mul);
	}
}
