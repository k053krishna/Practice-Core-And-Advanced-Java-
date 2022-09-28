package com.velocity.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList linkedList = new LinkedList();

		// how to add elements into linkedlList
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		linkedList.add(20); //duplicates are checking now
		linkedList.add("Krishna");//hatrogenious 
		linkedList.add(null);//adding null here
		System.out.println(linkedList);
	}
}
