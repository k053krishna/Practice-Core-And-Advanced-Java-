package com.assighment7;

import java.util.Scanner;

/* 
Design method to check whether the character is alphabet, 
digit and special symbol.
*/
public class CharacterType {
	public static void charType(int ch) {
		if (ch >= 65 && ch <= 90) { 
// Checking for Capital Alphabet ASCII value to check type of character
		System.out.println("It's a capital letter alphabet");
		} else if (ch >= 97 && ch <= 122) {
// Checking for small Alphabet ASCII value to check type of character
		System.out.println("It's a small letter alphabet");
		} else if (ch >= 48 && ch <= 57) { 
// Checking for Number ASCII value to check type of character
		System.out.println("It's a Number");
		} else if ((ch >= 33 && ch <= 47) || (ch >= 58 && 
		ch <= 64) || (ch >= 91 && ch <= 96)
		|| (ch >= 123 && ch <= 126)) {
// Checking for Special Character ASCII value to check type of character
		System.out.println("It's a special character");
		} else {
// If not a aplhabet, number or special symbol then this will execute
		System.out.println("Incorrect Input");
		}
		}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
// Creating scanner object of Scanner class
		System.out.println("Enter the character to be checked");
		int ch = scanner.next().charAt(0);
		charType(ch); // Calling method
		}
		}

