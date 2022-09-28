package com.velocity.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// Design LinkedList<Integer>
		
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(10);
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		
		Iterator<Integer> itr=linkedList.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());	
		}
	}
}
