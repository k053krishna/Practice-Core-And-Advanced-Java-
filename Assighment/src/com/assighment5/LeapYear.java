package com.assighment5;
/* write a program to check whether year is 
leap year or not. 
 (If else stmt). */

public class LeapYear {
	public static void main(String[] args) {
		int year = 2024;
		if ((year % 4) == 0) {
			System.out.println(year + " is a leap year");
		} else {
			System.out.println(year + " is not aleap year");
		}
	}
}
