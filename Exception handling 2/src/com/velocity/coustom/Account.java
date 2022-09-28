package com.velocity.coustom;

public class Account {
	private int balance = 8000;

	public int getBalance() {
		return balance;
	}

	public void getWithdrawAmount(int amount) {
		if (amount > balance) {
	    throw new InsufficientFundException("insuffcient"
                                 + " balance in your account");
		}
		balance = balance - amount;
	}
}
