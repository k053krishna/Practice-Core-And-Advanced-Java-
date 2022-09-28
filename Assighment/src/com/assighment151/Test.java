package com.assighment151;

import java.util.Scanner;

public class Test {
	public static Policy getPolicyDetails() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the policy id");
		int policyId=scanner.nextInt();
		System.out.println("Enter the policy Name");
		String policyName=scanner.next();
		System.out.println("Enter the policy type");
		String policyType=scanner.next();
		System.out.println("Enter the premium amount");
		int premiumAmount=scanner.nextInt();
	/*	
		int policyId = 10;
		String policyName = "lic";
		String policyType = "anually";
		int premiumAmount = 5000;
*/
		return new Policy(policyId, policyName, policyType, premiumAmount);

	}

	public static void main(String[] args) {
		Policy p=getPolicyDetails();
		System.out.println("id>>>" + p.policyId);
		System.out.println("name>>> " + p.policyName);
		System.out.println("Type>>> " + p.policyType);
		System.out.println("Amount>>> " + p.premiumAmount);
		
		
	}

	
	

}
