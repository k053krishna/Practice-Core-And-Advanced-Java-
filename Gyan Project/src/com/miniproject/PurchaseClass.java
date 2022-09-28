package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class PurchaseClass {
	Connection connection = null;
	PreparedStatement ps = null;
	long paybleAmount;
	
	String currentCustID;
	
	public void GotoCart() {
		System.out.println("----  PRODUCTS ADDED IN CART   ----");
		CustomerClass customer = new CustomerClass();
		currentCustID = customer.currentCustID;
		System.out.println(currentCustID);
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("select * from cartproduct");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				//System.out.println(rs.getInt(1));
				System.out.println("Product ID = "+rs.getInt(2));
				System.out.println("Product Name = "+rs.getString(3));
				System.out.println("Product Price = "+rs.getInt(4));
				System.out.println("Product Quantity = "+rs.getInt(5));
				System.out.println("Product Total Amount = "+rs.getInt(6));
				System.out.println();
				
				paybleAmount = paybleAmount + rs.getInt(6);
				
			}
			System.out.println("TOTAL PAYBLE AMOUNT : "+paybleAmount);
			
			
			connection.close();
			ps.close();
			rs.close();
			
			System.out.println();
			finalizeCart();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void finalizeCart() {
		System.out.println("1. Continue Payment");
		System.out.println("2. Want to remove some product from cart");
		Scanner scan = new Scanner(System.in);
		int act = scan.nextInt();
		switch(act) {
			case 1:
				makePayment();
				break;
			case 2:
				removeFromCart();
				break;
			default:
				System.err.println("Wrong Selection !!! Choose any from 1 & 2");
				finalizeCart();
				break;
		}

	}
	public void removeFromCart() {
		System.out.println("Select Product ID to remove from cart");
		Scanner scan = new Scanner(System.in);
		int removeItem = scan.nextInt();
		
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("delete from cartproduct where id=?");
			ps.setInt(1, removeItem); 
			int i = ps.executeUpdate();
			System.out.println("Item removed from cart " +i);
			System.out.println();
			System.out.println("after removing from cart");
			System.out.println();
			ps = connection.prepareStatement("select * from cartproduct");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Cart Item ID = "+rs.getInt(1));
				System.out.println("Product ID = "+rs.getInt(2));
				System.out.println("Product Name = "+rs.getString(3));
				System.out.println("Product Price = "+rs.getInt(4));
				System.out.println("Product Quantity = "+rs.getInt(5));
				System.out.println("Product Total Amount = "+rs.getInt(6));
				System.out.println();
			}
			finalizeCart();
			connection.close();
			ps.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		scan.close();
		
	}
	public void makePayment() {
		System.out.println("PAYMENT SUCCESSFUL!!!");
		EmptyCart();
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("insert into customerhistory(cust_emailID, paidamount)values(?,?)");
			
			ps.setString(1, currentCustID);
			ps.setLong(2, paybleAmount);
			
			int i = ps.executeUpdate();
			//System.out.println("Record is inserted successfully into customerhistory.." + i);
			
			connection.close();
			ps.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public void EmptyCart() {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("delete from cartproduct");
			ps.executeUpdate();
			//System.out.println("Record is deleted from cart successfully");
			
			connection.close();
			ps.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

