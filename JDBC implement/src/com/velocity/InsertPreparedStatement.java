package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertPreparedStatement {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

			ps = con.prepareStatement("insert into student (firstname,lastname,address,city,salary) values(?,?,?,?,?)");
            
			ps.setString(1, "vaibhav");
			ps.setString(2, "pawar");
			ps.setString(3, "fcroad");
			ps.setString(4, "kolkata");
			ps.setString(5, "86000");
			int a=ps.executeUpdate();
			
			System.out.println("Record is inserted " +a);
		} catch (Exception e) {

		} finally {
        
			con.close();
			ps.close();
		}
	}
}
