package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateOperationMultiple {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");

			ps = con.prepareStatement("update employee set firstname=?,lastname=?,city=? where id=?");

			ps.setString(1, "pawan");
			ps.setString(2, "mandal");
			ps.setString(3, "saugni");
			ps.setInt(4, 10);

			int a = ps.executeUpdate();
			System.out.println("Record is updated" + a);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
        con.close();
        ps.close();
		}
	}
}
