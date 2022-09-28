package com.assighment20;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MobileNumAdd {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		for(int i=1;i<=5;i++) {
			
			System.out.println("Enter the mobile number");
			Scanner scanner =new Scanner(System.in);
			String mob=scanner.next();
			al.add(mob);
			}
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
