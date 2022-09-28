package com.test;

import java.util.Arrays;

public class ArrayEqual {

	public static void main(String[] args) {
		
		int a1[] = { 1, 2, 3, 9, 5, 6 };
		int a2[] = { 1, 2, 3, 4, 5, 6 };
		int a3[] =  {3,4,5,6,7};
		System.out.println(Arrays.equals(a1,a2));
		System.out.println(Arrays.equals(a2, a3));
	}
}
