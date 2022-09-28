package com.hierarchicalinheritance;

public class TestMain {
	public static void main(String[] args) {

		HomeLoan homeLoan = new HomeLoan();
		PersonalLoan personalLoan = new PersonalLoan();
		CarLoan carLoan = new CarLoan();

		homeLoan.getHomeLoanDetails();
		homeLoan.getLoanDetails();

		personalLoan.getPersonalLoanDetails();
		personalLoan.getLoanDetails();

		carLoan.getCarLoanDetails();
		carLoan.getLoanDetails();

	}
}
