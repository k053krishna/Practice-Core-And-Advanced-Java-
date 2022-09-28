package com.assighment122;

import java.util.Scanner;

public class Insurance {
int id;
String personName;
String insuranceCompany;

public void getInsuranceDetails() {
	System.out.println("Enter the id");
	Scanner scanner=new Scanner (System.in);
	id=scanner.nextInt();
	System.out.println("Enter the person Name");
	personName=scanner.next();
	System.out.println("Enter the insuranceCompany");
	insuranceCompany=scanner.next();
	getInsuranceInformation(id,personName,insuranceCompany);
			
	
}

private void getInsuranceInformation(int id2,
		String personName2, String insuranceCompany2) {
	System.out.println( "id is >>>" +id2);
	System.out.println(personName2);
	System.out.println(insuranceCompany2);
}
}
