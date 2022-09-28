package com.assighment16;

import java.util.Scanner;

public class TestMain {
   
	public static void main(String[] args) {
		Product product= new Product();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the input product weight...");
         int productweight=scanner.nextInt();
         try {
        	 product.productCheck(productweight);
         }catch(Exception e){
          e.printStackTrace();
         }finally {
        	 scanner.close();
        	
         }
         
	}
}
