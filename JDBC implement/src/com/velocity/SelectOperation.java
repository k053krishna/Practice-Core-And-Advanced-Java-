package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOperation {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			ps = con.prepareStatement("select*from employee");
			rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("id... " + rs.getInt(1));
				System.out.println("firstname... " + rs.getString(2));
				System.out.println("lastname... " + rs.getString(3));
				System.out.println("address... " + rs.getString(4));
				System.out.println("address... " + rs.getString(5));
				System.out.println("salary... " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			rs.close();
			ps.close();
			con.close();
		}
	}
}
