package com.velocity.pune;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		
		Iterator<Integer> itr= al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
}
