package com.velocity.pune;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

//Add 3 student mobile number
//ArrayList program for taking the input from user
public class ArrayListDemo11 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter the mobile number");
			Scanner scanner = new Scanner(System.in);
			String mobnum = scanner.next();
			al.add(mobnum);
		}
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
