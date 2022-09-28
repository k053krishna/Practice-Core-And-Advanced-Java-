package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;


public class ProductDetailsClass {
	Connection connection = null;
	PreparedStatement ps = null;
	
	int productId;
	int selectedProductId;
	String selectedProductName;
	int selectedProductPrice;
	int selectedProductQuantity;
	int productQuantity;
	
	boolean isAdmin = false;
	

	public void showMainMenu(){
		System.out.println("-----------------   PRODUCTS LIST   ----------------------");
		System.out.println();
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			if(isAdmin) {
				System.out.println("---------------------------------------------------------------------------------------------");  
				System.out.printf("%5s %18s %9s %15s %12s", "PRODUCT ID", "PRODUCT NAME", "PRICE", "DESCRIPTION", "QUANTITY");  
				System.out.println();  
				System.out.println("---------------------------------------------------------------------------------------------");
			}
			else {
				System.out.println("---------------------------------------------------------------------------------------------");  
				System.out.printf("%5s %18s %9s %15s", "PRODUCT ID", "PRODUCT NAME", "PRICE", "DESCRIPTION");  
				System.out.println();  
				System.out.println("---------------------------------------------------------------------------------------------");
			}
			ps = connection.prepareStatement("select * from product");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				//System.out.format("%7s %18s %12s %14s %10s", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));  
				//System.out.println();
				
				/*System.out.println("Product ID = "+rs.getInt(1));
				System.out.println("Product Name = "+rs.getString(2));
				System.out.println("Product Price = "+rs.getInt(3));
				System.out.println("Product Description = "+rs.getString(4));*/
				
				if(isAdmin) {
					System.out.format("%7s %18s %12s %14s %10s", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)); 
				//System.out.println("Product Quantity = "+rs.getInt(5));
				} else {
					System.out.format("%7s %18s %12s %14s", rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4)); 
				}
				System.out.println();
			}
			System.out.println();
			selectProduct();
			connection.close();
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void showSelectedProductAdmin(int productId) {
		isAdmin = true;
		showSelectedProduct(productId);
	}
	public void showSelectedProduct(int productId) {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			
			if(isAdmin) {
				System.out.println("---------------------------------------------------------------------------------------------");  
				System.out.printf("%5s %15s %12s %12s %12s", "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "IN STOCK", "SOLD OUT");  
				System.out.println();  
				System.out.println("---------------------------------------------------------------------------------------------");
			} else {
				System.out.println("---------------------------------------------------------------------------------------------");  
				System.out.printf("%5s %18s %9s %15s", "PRODUCT ID", "PRODUCT NAME", "PRICE", "DESCRIPTION");  
				System.out.println();  
				System.out.println("---------------------------------------------------------------------------------------------");
			}
			
			ps = connection.prepareStatement("select * from product where product_id = ?");
			ps.setInt(1, productId);
			ResultSet rs = ps.executeQuery();
			
			
			
			while(rs.next()) {
				selectedProductId = rs.getInt(1);
				selectedProductName = rs.getString(2);
				selectedProductPrice = rs.getInt(3);
				productQuantity = rs.getInt(5);
				
				//System.out.println("Product ID = "+rs.getString(1));
				//System.out.println("Product Name = "+rs.getString(2));
				if(isAdmin) {
					System.out.format("%7s %18s %8s %10s %12s", rs.getInt(1), rs.getString(2), rs.getInt(5), rs.getInt(6), rs.getInt(7)); 
					
					//System.out.println("Total Quantity = "+rs.getInt(5));
					//System.out.println("In Stock = "+rs.getInt(6));
					//System.out.println("Sold Out = "+rs.getInt(7));
					System.out.println();

				} else if(!isAdmin){
					System.out.format("%7s %20s %10s %10s", rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4)); 
					
					//System.out.println("Product Price = "+rs.getInt(3));
					//System.out.println("Product Description = "+rs.getString(4));
					System.out.println();
					addQuantity();
				}
				System.out.println();
			}
			
			//selectProduct();
			connection.close();
			ps.close();
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	public void selectProduct() {
		//System.out.println("------ select Product called ------");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Select Prouduct ID you want to 'ADD TO CART'");
		productId = scan.nextInt();
		
		showSelectedProduct(productId);

		scan.close();
		//addQuantity();
	}
	public void addQuantity() {
		String quantChk;
		int quant = 0;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("Add Quantity :");
			quant = scan.nextInt();
			
			System.out.println("Quantity : "+quant);
			selectedProductQuantity = quant;
			System.out.println();
			System.out.println("Do you want to change quantity? (Press Y for Yes & N for No)!!");
			quantChk = scan.next();
			

		} while (quantChk.equals("y")|| quantChk.equals("Y"));
		//scan.close();
		updateProductQuantity();
		cartProductDetails();
		
	}
	public void updateProductQuantity() {
		//System.out.println(selectedProductQuantity + " " + productQuantity);
		int inStock = productQuantity - selectedProductQuantity;
		//System.out.println("Product In-Stock = "+ inStock);
		
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("update product set product_instock=?, product_sold=? where product_id=?");
			ps.setInt(1, inStock);
			ps.setInt(2, selectedProductQuantity);
			ps.setInt(3, selectedProductId);
			int i = ps.executeUpdate();
			//System.out.println("Stock Record updated." +i);
			connection.close();
			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void BuyPurchase() {
		System.out.println();
		System.out.println("1. BUY       2. Continue Shopping");
		Scanner scan = new Scanner(System.in);
		int act1 = scan.nextInt();
		
		switch(act1) {
			case 1:
				PurchaseClass purchaseClass = new PurchaseClass();
				purchaseClass.GotoCart();
				break;
			case 2:
				System.out.println("Select Prouduct ID you want to 'ADD TO CART'");
				productId = scan.nextInt();
				showSelectedProduct(productId);
				break;
			default:
				System.err.println("Wrong Selection!!! Choose any from 1 & 2");
				BuyPurchase();
				break;
		}
		//scan1.close();
	}
	public void cartProductDetails() {
		//System.out.println("----  CART PRODUCT DETAILS  ----");
		long selectedProductAmount = 0;
		selectedProductAmount = selectedProductPrice * selectedProductQuantity;
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("insert into cartproduct (id, name, price, quantity, amount) values(?,?,?,?,?)");
			ps.setInt(1, selectedProductId); 
			ps.setString(2, selectedProductName);
			ps.setInt(3, selectedProductPrice);
			ps.setInt(4, selectedProductQuantity);
			ps.setLong(5, selectedProductAmount);
			
			int i = ps.executeUpdate();
			System.out.println("Product added to cart");
			
			connection.close();
			ps.close();
			BuyPurchase();
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
}
