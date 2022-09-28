package com.assighment121;

import java.util.Scanner;

public class SBIBank extends Bank {
	public	void getSBIBankDetails(){
		System.out.println("Enter the priciple amount");
		Scanner scanner= new Scanner(System.in);
		double amut =scanner.nextDouble();
		System.out.println("Enter the tenure");
		int ten=scanner.nextInt();
		System.out.println("rate of interest");
		float rate=scanner.nextFloat();
		System.out.println("simple interest of icici bank "
		+ getCalculateInterest(amut,ten,rate));
	}

private double getCalculateInterest(double x, int y, float r) {

	return ((x*y*r)/100);
}
} 



