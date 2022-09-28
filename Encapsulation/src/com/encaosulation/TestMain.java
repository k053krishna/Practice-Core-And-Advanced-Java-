package com.encaosulation;

import java.util.Scanner;

public class TestMain {
	public static void getUserInput() {
		System.out.println("Enter the user id>>>");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("Enter the Employee Name");
		String name = scanner.next();
		System.out.println("Enter the Employee City");
		String city = scanner.next();

		Employe employe = new Employe();
		employe.setEmployeeId(id);
		employe.setEmployeeName(name);
		employe.setEmployeeCity(city);
		
		System.out.println("Employee id>>> "+employe.getEmployeeId());
		System.out.println("Employee name>>"+employe.getEmployeeName());
		System.out.println("Employee city>>"+employe.getEmployeeCity());
		
	}
	public static void main(String[] args) {
		getUserInput();
	}
}
