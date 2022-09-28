package com.assighment6;

import java.util.Scanner;

/*Design method int factorial(int no) which returns 
int value to that method. 
print the results into main method 
(Example enter no as 5, factorial means 5*4*3*2*1 
then output is 120)
*/
public class Factorial {

	int factorial(int no) {
		int fact = 1;
		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		Factorial factorial = new Factorial();
		int result = factorial.factorial(num);
		System.out.println(result);
	}
}
