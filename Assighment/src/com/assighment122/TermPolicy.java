package com.assighment122;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance{
	int duration;
	public void getTermPolicyDetails() {
		System.out.println("Enter the duration");
		Scanner scanner= new Scanner(System.in);
		duration=scanner.nextInt();
		getTermPolicyInformation(duration);
	}
	private void getTermPolicyInformation(int duration2) {
		System.out.println(duration2);
	}

}
