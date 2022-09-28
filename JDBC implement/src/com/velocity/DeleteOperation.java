package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

public class DeleteOperation {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		PreparedStatement ps = null;

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			ps = con.prepareStatement("delete from employee where id=?");
			ps.setInt(1, 5);
			int a = ps.executeUpdate();
			System.out.println("record is loaded");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
        con.close();
        ps.close();
		}
	}
}
