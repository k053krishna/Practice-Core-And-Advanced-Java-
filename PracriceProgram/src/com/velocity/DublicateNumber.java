package com.velocity;

public class DublicateNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8};
		int sum1=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
	 }
		System.out.println("sum of the element in array" +sum1);
		int sum2=0;
		for(int i=1;i<=8;i++) {
			sum2=sum2+i;
		}
		System.out.println("sum of the element in range" +sum2);
	System.out.println("missing number in a array is " +(sum2-sum1));
			
		}
	}
	

