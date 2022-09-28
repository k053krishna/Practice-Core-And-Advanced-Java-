package com.assighment8;

import java.util.Scanner;

public class EmployeeInformation {

	public void getUserInput() {
		Employee employee = new Employee();
		System.out.println("Enter the first name");
		Scanner scanner = new Scanner(System.in);
		employee.firstName = scanner.next();
		System.out.println("Enter the last name");
		employee.lastName = scanner.next();
		System.out.println("Enter the city name");
		employee.city = scanner.next();
		System.out.println("Enter the mobile number");
		employee.mobileNumber = scanner.nextLong();
		System.out.println("Enter the country name");
		employee.country = scanner.next();
		getStudentInformation(employee.firstName, employee.lastName, employee.city, employee.mobileNumber,
				employee.country);
	}

	public void getStudentInformation(String fname, String lname, String city, long mobnum, String country) {
		System.out.println("student information");
		System.out.println("first name: " + fname);
		System.out.println("last nane:" + lname);
		System.out.println("city:" + city);
		System.out.println("mob number:" + mobnum);
		System.out.println("counry:" + country);
	}

	public static void main(String[] args) {
		EmployeeInformation employeeInformation = new EmployeeInformation();

		System.out.println("Enter the no of student");
		Scanner scanner = new Scanner(System.in);
		int count = scanner.nextInt();
		for (int i = 1; i <= count; i++) {

			System.out.println("student details>>>");

			employeeInformation.getUserInput();

		}
	}
}
