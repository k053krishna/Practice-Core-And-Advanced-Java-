package com.velocity;

import java.sql.SQLException;
import java.util.Scanner;

public class LogInClass{
	String mobileNo;
	
	public static void main(String[] args) {
		
	}
	public void createLogIn() {
		LogInClass login = new LogInClass();
		
		System.out.println();
		System.out.println("Select User Type:");
		System.out.println("1. Administrator      2. User");
		
		Scanner scan = new Scanner(System.in);
		int loginAct = scan.nextInt();
		if(loginAct == 1) {
			login.createAdminLogin();
		} else if(loginAct == 2) {
			try {
				login.createUserLogIn();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.err.println("Wrong Selection!! choose 1 or 2");
			login.createLogIn();
		}
		scan.close();
	}
	public void createAdminLogin() {
		System.out.println("-----   ADMIN LOGIN   -----");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Email :");
		String email = scan.next();
		System.out.println("Enter Password :");
		String password = scan.next();
		
		AdministratorClass admin = new AdministratorClass();
		admin.checkAdminRegistration(email, password);
		
		//AdministratorClass admin = new AdministratorClass();
		//admin.getAdminDetails();

	}
	public void createUserLogIn() throws SQLException {
		System.out.println();
		System.out.println("-----   USER LOGIN   -----");
		
		LogInClass login = new LogInClass();
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("1. Sign In");
		System.out.println("2. New Customer? Start Here");
		System.out.println();
		System.out.println("Choose any from above :");
		int loginAct1 = scan.nextInt();
		if(loginAct1 == 1) {
			login.createSignIn();
		} else if(loginAct1 == 2) {
			login.createNewAccount();
		} else {
			System.err.println("Wrong Selection!!! Choose from 1 or 2");
			login.createUserLogIn();
		}
	}
	public void createSignIn() {
		System.out.println("-----   SIGN IN   -------");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Email :");
		String email = scan.next();
		System.out.println("Enter Password :");
		String password = scan.next();
		CustomerClass customer = new CustomerClass();
		customer.checkRegistration(email, password);
	}
	public void createNewAccount() throws SQLException {
		LogInClass login = new LogInClass();
		System.out.println();
		System.out.println("-----   CREATE NEW ACCOUNT   -----");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name :");
		String firstName = scan.next();
		System.out.println("Enter Last Name :");
		String lastName = scan.next();
		System.out.println("Enter Mobile No :");
		mobileNo = scan.next();
		System.out.println("Enter Email :");
		String emailID = scan.next();
		System.out.println("Enter Password :");
		String password = scan.next();
		System.out.println("Press 'Y' to Continue or 'N' to Cancel");
		String action = scan.next();
		if(action.equals("y")|| action.equals("Y")) {
			CustomerClass customer = new CustomerClass();
			customer.insertCustomerData(firstName, lastName, mobileNo, emailID, password);
		}
	}
}
