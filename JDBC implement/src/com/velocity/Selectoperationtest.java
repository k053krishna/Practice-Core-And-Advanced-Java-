package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selectoperationtest {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root", "root");
			
			ps = con.prepareStatement("select id,firstname,city from employee");
			// step-4- Extra step
			rs = ps.executeQuery();
			while (rs.next()) { // 1st row- true
				System.out.println("ID>>" + rs.getString("id"));
				System.out.println("FirstName>>" + rs.getString("firstname"));
				//System.out.println("LastName>>" + rs.getString("lastname"));
				//System.out.println("Address>>" + rs.getString("address"));
				System.out.println("City>>" + rs.getString("city"));
				//System.out.println("Salary>>" + rs.getString("salary"));
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			con.close();
			ps.close();
			rs.close();
		
		}
	}
}
