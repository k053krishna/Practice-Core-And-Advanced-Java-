package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperationSingle {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			ps = con.prepareStatement("update employee set firstname=? where id=?");

			ps.setString(1, "ajay");
			ps.setInt(2, 10);

			int b = ps.executeUpdate();
			System.out.println("record is updated " + b);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
        con.close();
        ps.close();
		}
	}
}
