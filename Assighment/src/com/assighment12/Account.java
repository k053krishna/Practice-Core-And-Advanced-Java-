package com.assighment12;

import java.util.Scanner;

/**
 * Design the classes for IS relationship in java where SavingsAccount IS-A
 * account. and input should be hard coded and display it into mentioned
 * methods.
 */
public class Account {
	int accountNumber;
	String accountName;

	// getting input from user
	public void getAccountDetails() {
		System.out.println("Enter the account number>>");
		Scanner scanner = new Scanner(System.in);
		accountNumber = scanner.nextInt();
		System.out.println("Enter the account holder name");
		accountName = scanner.next();
		getAccountInformation(accountNumber, accountName);
	}

	// Printing the account details
	private void getAccountInformation(int accountNumber, String accountName) {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Name: " + accountName);
	}
}
