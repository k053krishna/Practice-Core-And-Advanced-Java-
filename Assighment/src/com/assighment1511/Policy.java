package com.assighment1511;

import java.util.Scanner;

public class Policy {
	int policyId;
	String policyName;
	String policyType;
	int premiumAmount;
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", premiumAmount=" + premiumAmount + "]";
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public void setPremiumAmount(int premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public static Policy getPolicyDetails() { 
	Policy policy=new Policy();
	return policy;
	
	}
	public static void main(String[] args) {
		Policy p= new Policy();
		p.getPolicyDetails();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the policy id");
		int policyId=scanner.nextInt();
		System.out.println("Enter the policy Name");
		String policyName=scanner.next();
		System.out.println("Enter the policy type");
		String policyType=scanner.next();
		System.out.println("Enter the premium amount");
		int premiumAmount=scanner.nextInt();
		
		p.setPolicyId(policyId);
		p.setPolicyName(policyName);
		p.setPolicyType(policyType);
		p.setPremiumAmount(premiumAmount);
		//p.getPolicyDetails();
		System.out.println(p);
	}
	
	
}
