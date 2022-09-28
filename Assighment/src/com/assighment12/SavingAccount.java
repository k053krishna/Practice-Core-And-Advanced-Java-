package com.assighment12;

import java.util.Scanner;

public class SavingAccount extends Account {
	static String accountType = "Saving";
	long balance;

//getting input from user
	public void getSavingAccountDetails() {
		System.out.println("Total balance is>>");
		Scanner scanner = new Scanner(System.in);
		balance = scanner.nextInt();
		getSavingAccountInformation(balance);
	}

// Printing the saving account details
	private void getSavingAccountInformation(long balance) {
		System.out.println("Account Type: " + accountType);
		System.out.println("Balance: " + balance);
	}
}
