package com.velocity.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo4 {

	public static void main(String[] args) {
		
		LinkedList link=new  LinkedList();
		link.add(10);
		link.add(15);
		link.add(20);
		link.add(25);
		
		for(Object o:link) {
			System.out.println(o);
		}
		
	}
}
