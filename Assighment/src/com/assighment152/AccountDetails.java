package com.assighment152;

import java.util.Scanner;

public class AccountDetails {

	public void getAccountDetails() {
		// take input from user
		// set the value into account object
		// calling the getWithdrawDetails()method
		System.out.println("Enter the id>>");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("Enter the account number>>");
		long accountNo = scanner.nextLong();
		System.out.println("Enter the balance>>");
		int bal = scanner.nextInt();

		Account account = new Account();
		account.setAccountId(id); // calling method
		account.setAccountNumber(accountNo);
		account.setAccountbalance(bal);
		getWithdrawDetails(account); // method calling
	}

	private int getWithdrawDetails(Account account) {
		int currentBalance = 0;
		System.out.println("Enter the amount for withdrawal>>");
		Scanner scanner = new Scanner(System.in);
		int withdrawAmount = scanner.nextInt();
		
		if (account.getAccountbalance() > withdrawAmount) {
		currentBalance = account.getAccountbalance() -
		withdrawAmount;
		
		}
		System.out.println("Your current account balance is>>" + currentBalance);
		return currentBalance;
	}

	public static void main(String[] args) {
		AccountDetails accountDetails = new AccountDetails();
	     accountDetails.getAccountDetails();
	}

}
