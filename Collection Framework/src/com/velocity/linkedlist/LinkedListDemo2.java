package com.velocity.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo2 {

	public static void main(String[] args) {
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("Ram");
		linkedList.add("Laxman");
		linkedList.add("Sita");
		// use for each loop
		for(String s:linkedList) {
		System.out.println(s);
		}
	}
}
