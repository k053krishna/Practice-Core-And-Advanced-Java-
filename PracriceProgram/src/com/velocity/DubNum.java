package com.velocity;

public class DubNum {

	public static void main(String[] args) {
		String arr[] = { "java", "python", "c", "c++", "java" };
		boolean value = false;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					value = true;
				System.out.println("duplicate number in a arry is " + arr[i]);
					
				}
			}
		}
		if (value == false) {
			System.out.println("dublicate number not found");
		}
	}
}
