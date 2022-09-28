package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.sql.ResultSet;

public class AdministratorClass {
	Connection connection = null;
	PreparedStatement ps = null;
	boolean isAdmin = false;

	public void checkAdminRegistration(String emailID, String password) {
		// System.out.println("check Registration called");
		final String queryCheck = "SELECT * from admin WHERE admin_emailid = '" + emailID + "'and admin_password = '"
				+ password + "'";
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement(queryCheck);
			final ResultSet rs = ps.executeQuery();

			if (rs.next()) {
				AdministratorClass admin = new AdministratorClass();
				admin.isAdmin = true;
				System.out.println();
				System.out.println("Administrator Sign In Successfully !!!");
				System.out.println();

				adminAct();

			} else {
				System.err.println("Email ID or Password is Incorrect. Try Again!!!");
				System.out.println();
				LogInClass login = new LogInClass();
				login.createAdminLogin();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void adminAct() throws SQLException {
		System.out.println("What do you want to check?");
		System.out.println("1. Administrator Details");
		System.out.println("2. Registered Customer Details");
		System.out.println("3. Check Product Quantity");
		System.out.println("4. Check Customer History");
		System.out.println("5. Check Product Details");
		System.out.println("6. Insert Product");
		System.out.println("7. Back To Home");
		System.out.println("8. EXIT");

		System.out.println();
		selectAct();
		/*
		 * System.out.println("Choose Activity:"); Scanner scan = new
		 * Scanner(System.in); while(scan.hasNext()) { int act = scan.nextInt();
		 * selectAct(act); } scan.close();
		 */
		// selectAct(act);

	}
	public void selectAct() throws SQLException {
		System.out.println("Choose Activity:");
		int act1 = 0;
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			act1 = scan.nextInt();
			switch (act1) {
			case 1:
				getAdminDetails();
				break;
			case 2:
				getCustomerDetails();
				break;
			case 3:
				getProductQuantityDetails();
				break;
			case 4:
				getCustomerHistoryDetails();
				break;
			case 5:
				getProductDetails();
				break;
			case 6:
				getInsertProuct();
				break;
			case 7:
				getBackToHome();
			case 8:
				exitApp();
			default:
				System.err.println("Wrong Selection");
				selectAct();
				break;
			}
		}
		scan.close();

	}
	public void getAdminDetails() {
		System.out.println("---   ADMINISTRATOR DETAILS   -----");
		System.out.println();
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("select * from admin");
			ResultSet rs = ps.executeQuery();
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			System.out.printf("%5s %20s %25s", "ADMIN ID", "EMAIL ID", "PASSWORD");
			System.out.println();
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			// System.out.println(al);
			// System.out.println();
			while (rs.next()) {

				System.out.format("%5s %30s %18s", rs.getInt(1), rs.getString(2), rs.getString(3));
				System.out.println();
				// System.out.format("%5s %10s %10s", adminList);
				// System.out.println();
				// System.out.println(adminList);

				/*
				 * System.out.println("Admin ID = "+rs.getInt(1));
				 * System.out.println("Admin EmailID = "+rs.getString(2));
				 * System.out.println("Admin Password = "+rs.getString(3));
				 * System.out.println(); System.out.println();
				 */
			}
			System.out.println();
			selectAct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public void getCustomerDetails() {
		System.out.println("------   REGISTERED CUSTOMER DETAILS   --------");
		System.out.println();
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("select * from customer");
			ResultSet rs = ps.executeQuery();
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			System.out.printf("%5s %12s %12s %15s %18s", "CUSTOMER ID", "FIRST NAME", "LAST NAME", "MOBILE NO",
					"E-MAIL ID");
			System.out.println();
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.format("%7s %12s %14s %18s %25s", rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5));
				System.out.println();

				/*
				 * System.out.println("Customer ID = "+rs.getInt(1));
				 * System.out.println("Customer First Name = "+rs.getString(2));
				 * System.out.println("Customer Last Name = "+rs.getString(3));
				 * System.out.println("Customer Mobile No = "+rs.getString(4));
				 * System.out.println("Customer Email ID = "+rs.getString(5));
				 * System.out.println();
				 */

			}
			System.out.println();
			selectAct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getProductQuantityDetails() throws SQLException {
		System.out.println("Select Prouduct ID you want to check quantity");

		Scanner scan = new Scanner(System.in);
		int productId = scan.nextInt();

		scan.close();

		ProductDetailsClass productD = new ProductDetailsClass();
		productD.showSelectedProductAdmin(productId);

		System.out.println();
		selectAct();
	}
	public void getCustomerHistoryDetails() throws SQLException {
		System.out.println("---   CUSTOMER HISTORY   -----");
		System.out.println();
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("select * from customerhistory");
			ResultSet rs = ps.executeQuery();
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			System.out.printf("%5s %18s %25s", "CUSTOMER ID", "EMAIL ID", "PAID AMOUNT");
			System.out.println();
			System.out.println(
					"---------------------------------------------------------------------------------------------");
			while (rs.next()) {
				System.out.format("%5s %30s %18s", rs.getInt(1), rs.getString(2), rs.getString(3));
				System.out.println();

				/*
				 * System.out.println("Customer ID = "+rs.getInt(1));
				 * System.out.println("Customer Email ID = "+rs.getString(2));
				 * System.out.println("Customer Paid Amout = "+rs.getString(3));
				 * System.out.println();
				 */

			}
			//System.out.println();
			//selectAct();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
		selectAct();
	}
	public void getInsertProuct() throws SQLException {
		ProductDetailsClass productDetails = new ProductDetailsClass();
		productDetails.insertProduct();
		System.out.println();
		selectAct();
	}
	public void getProductDetails() throws SQLException {
		ProductDetailsClass productD = new ProductDetailsClass();
		productD.showProductDetails();
		System.out.println();
		selectAct();
	}
	public void getBackToHome() throws SQLException {
		System.out.println("---------   HOME PAGE  --------");
		LogInClass login = new LogInClass();
		login.createLogIn();
		System.out.println();
		selectAct();
	}
	public void exitApp() {
		System.out.println("---------   EXIT  --------");
		System.out.println();
		System.out.println("************ PLEASE LOGIN AGAIN  ***************");
	}
}
