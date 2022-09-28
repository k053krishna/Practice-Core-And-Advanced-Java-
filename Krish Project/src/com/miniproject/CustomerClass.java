package com.miniproject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.sql.ResultSet;

public class CustomerClass {
	Connection connection = null;
	PreparedStatement ps = null;
	
	static String currentCustID;
	
	public void insertCustomerData(String firstName, String lastName, String mobileNo, String emailID, String password) throws SQLException {
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement("insert into customer(firstName, lastName, mobileNo, emailID, password)values(?,?,?,?,?)");
			ps.setString(1, firstName);
			ps.setString(2, lastName);
			ps.setString(3, mobileNo);
			ps.setString(4, emailID);
			ps.setString(5, password);
			
			int i = ps.executeUpdate();
			System.out.println("Record is inserted successfully.." + i);
			
			System.out.println();
			ProductDetailsClass productD = new ProductDetailsClass();
			productD.showMainMenu();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			connection.close();
			ps.close();
		}
	}
	public void checkRegistration(String emailID, String password) {
		//System.out.println("check Registration called");
		final String queryCheck = "SELECT * from customer WHERE emailID = '"+ emailID+"'and password = '"+password+"'";
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement(queryCheck);
			//ps.setString(1, emailID);
			//ps.setString(2, password);
			
			final ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				currentCustID = emailID;
				System.out.println("Sign In Successfully !!!");
				System.out.println();
				
				ProductDetailsClass productD = new ProductDetailsClass();
				productD.showMainMenu();
			} else {
				System.err.println("Not a registered customer. please first create your account.");
				System.out.println();
				
				LogInClass login = new LogInClass();
				try {
					login.createUserLogIn();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void insertDataIntoPurchase() {
		
	}
	public static void main(String[] args) throws SQLException {

	}
	public void checkDuplicateRegistration(String emailID,String mobileNo) {
		boolean status=false;
		final String queryCheck = "SELECT * from customer WHERE emailID = '"+ emailID+"'and mobileNo = '"+mobileNo+"'";
		try {
			ConnectionTest connectionTest = new ConnectionTest();
			connection = connectionTest.getConnectionDetails();
			ps = connection.prepareStatement(queryCheck);
			
			final ResultSet rs = ps.executeQuery();
			
			
				HashMap<String, String> hm=new HashMap<String,String>();
				//hm.put("mobileNo","emailID");
				hm.put("rs","null");
				Set<String> s =hm.keySet();
				Iterator<String> itr=s.iterator();
				while(itr.hasNext()){
					String str=itr.next();
					//System.out.println(str);
					//System.out.println(hm.get(str));
					
				}
			//}
		
			if(rs.next()) {
			currentCustID = emailID;
				System.out.println("Sign In Successfully !!!");
				System.out.println();
			
				ProductDetailsClass productD = new ProductDetailsClass();
				productD.showMainMenu();
			} else {
				System.err.println("Not a registered customer. please first create your account.");
				System.out.println();
				
				LogInClass login = new LogInClass();
          
				try {
					login.createUserLogIn();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



