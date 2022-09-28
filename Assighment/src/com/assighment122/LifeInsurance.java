package com.assighment122;

import java.util.Scanner;

public class LifeInsurance extends Insurance {
	int premiumAmount;
	public void getLifeInsuranceDetails() {
		System.out.println("Enter the premium amount ");
		Scanner scanner = new Scanner (System.in);
		premiumAmount=scanner.nextInt();
		getLifeInsuranceInformation(premiumAmount);
	}
	private void getLifeInsuranceInformation(int premiumAmount2) {
		System.out.println(premiumAmount2);
	}

}
