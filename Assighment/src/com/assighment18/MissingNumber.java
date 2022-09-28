package com.assighment18;

public class MissingNumber {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,6,7,8,9};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++) {
			sum1=sum1+a[i];
		}
		System.out.println("Sum of emement in array" +sum1);
		
		for(int j=1;j<=9;j++) {
			sum2=sum2+j;
		}
		System.out.println("Sum of element in range" +sum2);
		System.out.println("missing number" +(sum2-sum1));
	}
}
