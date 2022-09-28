package com.velocity.coustom;

public class InsufficientFundException extends RuntimeException{

	private String message;

	public InsufficientFundException(String message) {
		//super(message);
		this.message=message;
	}
}
