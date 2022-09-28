package com.test;

import java.io.FileInputStream;
import java.util.Properties;

public class Test {
	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Shree\\Desktop\\Sample.properties");
			Properties properties = new Properties();
			properties.load(fis);
			String user=properties.getProperty("username");
			String pass=properties.getProperty("password");
			
			System.out.println("Username is " + user);
			System.out.println("password is " +pass);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
