package com.velocity.coustom;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Account account = new Account();
		System.out.println("Available balance:" + account.getBalance());
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Amount");
		int value=scanner.nextInt();
		account.getWithdrawAmount(value);
		System.out.println("current balance:" + account.getBalance());
	}
}
