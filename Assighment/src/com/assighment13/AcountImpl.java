package com.assighment13;

import java.util.Scanner;

public class AcountImpl implements Account {

	@Override
	public void getSavingAccount() {
		System.out.println("Enter the name");
		Scanner scanner = new Scanner(System.in);
		String username = scanner.next();
		System.out.println("enter the balance ");
		int userbalance = scanner.nextInt();
		gstUserDetails(username, userbalance);
	}

	@Override
	public void gstUserDetails(String name, float balance) {
		System.out.println("user naame is >>" + name);
		System.out.println("user balance is>>" + balance);
	}

	public static void main(String[] args) {
		AcountImpl acountImpl = new AcountImpl();
		acountImpl.getSavingAccount();
	}
}
