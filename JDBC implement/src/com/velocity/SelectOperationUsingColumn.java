package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectOperationUsingColumn {

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
				System.out.println("id... " + rs.getInt("id"));
				System.out.println("firstname... " + rs.getString("firstname"));
				System.out.println("lastname... " + rs.getString("lastname"));
				System.out.println("address... " + rs.getString("address"));
				System.out.println("city... " + rs.getString("city"));
				System.out.println("salary... " + rs.getString("salary"));
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
