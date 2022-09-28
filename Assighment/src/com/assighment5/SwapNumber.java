package com.assighment5;
/*Write a program to swap the two numbers */
public class SwapNumber {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		//before swap
		System.out.println("before swap");
		System.out.println("a" + a+ " :" +"& b" +b);
		//after swap
		temp=a;
		a=b;
		b=temp;
		System.out.println("after swap");
		System.out.println("a" + a+ " :" +"& b" +b);
	}

}
