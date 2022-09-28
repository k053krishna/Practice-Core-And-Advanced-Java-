package com.assighment20;
/*Assignments 20
1. Write program to add the five students mobile number 
into arraylist and iterate that elements using iterator. 
2. Design the generics arraylist for string and add five 
cities into it and iterate that using for each loop.
3. Design the method for ArrayList<Employee> which returns 
the list of employee and print that data.
4. Suppose I have arraylist which contain elements as 
[mumbai, pune, Bangalore, Hyderabad, mumbai], now I want to
 remove the mumbai from list and print that data.

 * 
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AddCity {

	public static void main(String[] args) {
		
		ArrayList<String> al=new ArrayList<String>();
		for(int i=1;i<=5;i++) {
			
			System.out.println("Enter the city name");
			Scanner scanner =new Scanner(System.in);
			String city=scanner.next();
			al.add(city);
		}
		/*
	    Iterator<String> itr= al.iterator();
	    while(itr.hasNext()) {
	    	System.out.println(itr.next());
	    }
		*/	
		for(String s:al) {
			System.out.println(s);
		}	
	}
	
}