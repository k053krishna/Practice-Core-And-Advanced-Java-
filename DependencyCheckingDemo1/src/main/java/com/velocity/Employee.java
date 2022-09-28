package com.velocity;

//Employee has a address
public class Employee {

	private int balance;
	private Address address;
	
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public void getEmployeeData() {
		System.out.println("Balance: " +balance );
		System.out.println("Pincode: "+ address.getPincode());
	}
	
}
