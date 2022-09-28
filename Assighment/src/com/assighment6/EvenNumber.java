package com.assighment6;

import java.util.Scanner;

/*write a program to print all even number from 50 to 
75.
*/
public class EvenNumber {
public static void main(String[] args) {
	System.out.println("Enter the first number");
	Scanner scanner=new Scanner(System.in);
	int fno=scanner.nextInt();
	System.out.println("Enter the second number");
	int secno=scanner.nextInt();
	
	for(int i=fno;i<=secno;i++) {
		if((i%2)==0) {
			System.out.println(+i);
		}
	}
}
}
