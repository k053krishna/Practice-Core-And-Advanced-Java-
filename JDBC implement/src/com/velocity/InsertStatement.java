package com.velocity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatement {

	public static void main(String[] args) throws SQLException {

		Connection con = null;
		Statement stmt = null;

		try {
			String insertQuery = "insert into student(firstname,lastname,address,city,salary)values('ram','patil','kothrud','pune','90000')";

			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");

			stmt = con.createStatement();

			stmt.execute(insertQuery);

			System.out.println("Data is inserted ....");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
			stmt.close();
		}
	}
}
