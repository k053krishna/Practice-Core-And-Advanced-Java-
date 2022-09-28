package Assighment4;

import java.util.Scanner;

public class Factorial {
	public int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		System.out.println("Enter the number");
		Scanner scanner= new Scanner(System.in);
		int no=scanner.nextInt();
		int result=factorial.factorial(no);
		System.out.println("factorial of number is>> " +result);
	}

}
