package com.velocity;

public class MaxNumberINAarray {
   
	 public static void main(String[] args) {
		
		 int arr[]= {10,20,60,100,750,876};
		 int max=arr[0];
		 for(int i=1;i<arr.length;i++) {
			 if (arr[i]>max) {
				 max=arr[i];
			 }
		 }
		 System.out.println(max);
	}
}
