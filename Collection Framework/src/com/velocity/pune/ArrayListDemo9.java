package com.velocity.pune;

import java.util.ArrayList;

public class ArrayListDemo9 {
	
// Design method which return arraylist object
	
	public static ArrayList getData() {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		return al;
	}
	public static void main(String[] args) {
		ArrayList arraylist=getData();
		System.out.println(arraylist);
	}
}
