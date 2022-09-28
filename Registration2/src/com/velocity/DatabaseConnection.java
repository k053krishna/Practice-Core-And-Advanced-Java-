package com.velocity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DatabaseConnection {
	// Design method which return the connection object
		public static Connection getConnection() {
			Connection con = null;
			try {
				// Step-1- Loading the driver class
				Class.forName("com.mysql.jdbc.Driver");
				// Step-2- Connection established
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return con;
		}

		public static void save(Employee employee) {
			try {
				Connection conn = getConnection(); // calling method
				// step-3- using preparedstatement data insert into database
				PreparedStatement ps = conn
						.prepareStatement("insert into student(firstname,lastname,address,city,salary)values(?,?,?,?,?)");
				ps.setString(1, employee.getFirstName());
				ps.setString(2, employee.getLastName());
				ps.setString(3, employee.getAddress());
				ps.setString(4, employee.getCity());
				ps.setString(5, employee.getSalary());
				// step-4- submitting to db
				ps.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		// Design method which return List<Employee>
		public static List<Employee> getAllEmployeeData() {
			List<Employee> list = new ArrayList<Employee>();
			try {
				Connection con = getConnection();
				// step-3
				PreparedStatement ps = con.prepareStatement("select * from student");
				// step-4
				ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					Employee emp = new Employee();
					emp.setId(rs.getInt(1));
					emp.setFirstName(rs.getString(2));
					emp.setLastName(rs.getString(3));
					emp.setAddress(rs.getString(4));
					emp.setCity(rs.getString(5));
					emp.setSalary(rs.getString(6));
					list.add(emp);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			return list;
		}
	}

