package com.project.velocity.groupe1;
import java.sql.Connection;
import java.sql.DriverManager;

public class MysqlConnection 
{
	public static Connection getConnection() throws Exception{
		System.out.println("inside Databasase connection...");
	
		Connection connection =null;
		try{
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root","root");
		System.out.println("Connection Done " +connection);
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		return connection;		
	}
}
