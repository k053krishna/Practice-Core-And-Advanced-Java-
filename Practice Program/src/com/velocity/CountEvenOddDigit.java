package com.velocity;

public class CountEvenOddDigit {

	public static void main(String[] args) {
		 int num=12345678;
		 int countEvendigit=0;
		 int countOdddigit=0;
		 while(num!=0) {
			 int remender=num/10;
			 if(remender%2==0) {
				 countEvendigit++; 
			 }
			 if(remender%2!=0) {
				 countOdddigit++; 
			 }
		 }
		System.out.println("even number is " +countEvendigit);
		System.out.println("odd number is " +countOdddigit);
	}
}
