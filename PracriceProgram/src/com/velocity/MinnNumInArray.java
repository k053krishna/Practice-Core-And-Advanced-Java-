package com.velocity;

public class MinnNumInArray {

	 public static void main(String[] args) {
		
		 int a[]= {10,323,263,23,234,456,65};
		 int min=a[0];
		 for(int i=1;i<a.length;i++) {
			 if(a[i]<min) {
			 min=a[i];
			 }
		 }
		 System.out.println(min);
	}
}
