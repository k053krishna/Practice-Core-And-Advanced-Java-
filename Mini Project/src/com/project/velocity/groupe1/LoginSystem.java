package com.project.velocity.groupe1;

import java.util.Scanner;

	public class LoginSystem 
	{
		
	public static void main(String[] args) throws Exception	
	{
		System.out.println("**********************");
		System.out.println("*****Welcome To Ecommerce Group E1 *******");
		System.out.println("**********************");
		System.out.println("###############################################################");
		System.out.println("  Login as....................");
		System.out.println("        1 : Login As Admin");
		System.out.println("        2 : Login As User");
		System.out.println("Chosse an option(1/2)");
		System.out.println("###############################################################");
		Scanner scanner=new Scanner(System.in);
		int loginoption=scanner.nextInt();
		switch(loginoption)
		{
		case 1:
			LoginAsAdmin ad=new LoginAsAdmin();
			ad.loginAsAdmin();
			ad.InsertProduct();
			ad.ProductDetails();
			ad.ProductQuentity();
			ad.Userlist();
			ad.UserHistory();
			break;
		case 2:
			LoginAsUser au=new LoginAsUser();
		    au.loginAsUser();
			au.ProductList();
			au.UserSelectedProduct();
			au.UserCart();
			au.TotalUserBill();
			break;
		default:
			System.out.println("Invalid Input");
		}
		}
	}


