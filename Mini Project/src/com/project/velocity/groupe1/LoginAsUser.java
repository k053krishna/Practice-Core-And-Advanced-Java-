package com.project.velocity.groupe1;
	
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class LoginAsUser {

	public static void loginAsUser() 
	{
		System.out.println("**********************");
		System.out.println("****** Welcome USER ******");
		System.out.println("**********************");
		System.out.println("        1 : ProductList");
		System.out.println("        2 : User Selected Product");//ha
		System.out.println("        3 : User Cart");
		System.out.println("        4 : Total User Bill");
		System.out.println("Chosse an option(1/2/3/4)");
		System.out.println("###############################################################");
		try (Scanner scanner = new Scanner(System.in)) {
			int adminoptions=scanner.nextInt();
			switch(adminoptions)
			{
			case 1:
				ProductList();
				break;
			case 2:
				UserSelectedProduct();
				break;
			case 3:
				UserCart();
				break;
			case 4: 
				TotalUserBill();
				break;
			default:
				System.out.println("Invalid Input");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void TotalUserBill() throws SQLException {
		Connection connection = null;
		PreparedStatement pstatement = null;
		try {
			MysqlConnection mysqlconnection = new MysqlConnection();
			connection = mysqlconnection.getConnection();
			// step-3
			pstatement = connection.prepareStatement("select totalamount from mycart ");

			// step-5 summit sql to database
			int a = pstatement.executeUpdate();
			System.out.println("record is selected " + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			pstatement.close();
		}
	}

	public static void UserCart() throws SQLException {
		Connection connection = null;
		PreparedStatement pstatement = null;
		try {
			MysqlConnection mysqlconnection = new MysqlConnection();
			connection = mysqlconnection.getConnection();
			// step-3
			pstatement = connection.prepareStatement("select * from mycart ");

			// step-5 summit sql to database
			int a = pstatement.executeUpdate();
			System.out.println("record is selected " + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			pstatement.close();
		}
	}

	public static void UserSelectedProduct() throws SQLException {
		Connection connection = null;
		PreparedStatement pstatement = null;
		try {
			MysqlConnection mysqlconnection = new MysqlConnection();
			connection = mysqlconnection.getConnection();
			// step-3
			pstatement = connection.prepareStatement("select totalamount from mycart ");

			// step-5 summit sql to database
			int a = pstatement.executeUpdate();
			System.out.println("record is selected " + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			pstatement.close();
		}
	}

	public static void ProductList() {
		// TODO Auto-generated method stub
		
	}

	
}
