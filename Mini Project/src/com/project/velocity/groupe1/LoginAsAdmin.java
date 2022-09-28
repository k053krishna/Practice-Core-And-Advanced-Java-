package com.project.velocity.groupe1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginAsAdmin {
	public static void loginAsAdmin() {
		System.out.println("**********************");
		System.out.println("****** Welcome ADMIN ******");
		System.out.println("**********************");
		System.out.println("        1 : Insert Product");
		System.out.println("        2 : Product Details");
		System.out.println("        3 : Product Quentity");
		System.out.println("        4 : User List");
		System.out.println("        5 : Display User History");
		System.out.println("Chosse an option(1/2/3/4/5)");
		System.out.println("###############################################################");
		try (Scanner scanner = new Scanner(System.in)) {
			int adminoptions = scanner.nextInt();
			switch (adminoptions) {
			case 1:
				InsertProduct();
				break;
			case 2:
				ProductDetails();
				break;
			case 3:
				ProductQuentity();
				break;
			case 4:
				Userlist();
				break;
			case 5:
				UserHistory();
				break;
			default:
				System.out.println("Invalid Input");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void InsertProduct() throws Exception {
		Connection connection = null;
		PreparedStatement pstatement = null;
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the productid");
			int productid = scanner.nextInt();
			System.out.println("Enter the description");
			String description = scanner.next();
			System.out.println("Enter the price");
			String price = scanner.next();
			System.out.println("Enter the product name");
			String productname = scanner.next();
			System.out.println("Enter the quantity");
			String quantity = scanner.next();

			MysqlConnection mysqlconnection = new MysqlConnection();
			connection = mysqlconnection.getConnection();
			// step-3
			pstatement = connection.prepareStatement(
					"insert into product (productid,description,price,productname,quantity)values(?,?,?,?,?)");
			pstatement.setInt(1, productid);
			pstatement.setString(2, description);
			pstatement.setString(3, price);
			pstatement.setString(4, productname);
			pstatement.setString(5, quantity);
			// step-5 summit sql to database
			int a = pstatement.executeUpdate();
			System.out.println("record is inserted " + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			pstatement.close();
		}
	}

	public static void UserHistory() throws SQLException {

		Connection connection = null;
		PreparedStatement pstatement = null;
		try {
			MysqlConnection mysqlconnection = new MysqlConnection();
			connection = mysqlconnection.getConnection();
			// step-3
			pstatement = connection.prepareStatement("select * from user");

			// step-5 summit sql to database
			int a = pstatement.executeUpdate();
			System.out.println("record is inserted " + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			pstatement.close();
		}
	}

	public static void Userlist() {

	}

	public static void ProductQuentity() {

	}

	public static void ProductDetails() throws SQLException {

		Connection connection = null;
		PreparedStatement pstatement = null;
		try {
			MysqlConnection mysqlconnection = new MysqlConnection();
			connection = mysqlconnection.getConnection();
			// step-3
			pstatement = connection.prepareStatement("select * from product");

			// step-5 summit sql to database
			int a = pstatement.executeUpdate();
			System.out.println("record is inserted " + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			pstatement.close();
		}
	}
	

	public void Exit() {
		System.out.println("**********************");
		System.out.println("****** Please Visit Ones More Time ******");
		System.out.println("**********************");
	}

}
