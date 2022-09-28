package com.miniproject;

import java.util.Scanner;

public class MainClass {
	boolean isAdmin = false;
	
	public static void main(String[] args) {
		//MainClass.mainC = new MainClass();
		System.out.println("***********************************************");
		System.out.println();
		System.out.println("*****Hello, Welcome to our E-Commerce Shop*****");
		System.out.println();
		System.out.println("************************************************");
		LogInClass login = new LogInClass();
		login.createLogIn();
		
		//ProductDetailsClass productD= new ProductDetailsClass();
		//productD.showSelectedProductAdmin(121);
	}
}
