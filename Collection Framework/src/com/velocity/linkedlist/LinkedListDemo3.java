package com.velocity.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo3 {

	// Design LinkedList which return linkedlist object
	public LinkedList getLinkedListDemo() {
		LinkedList lkd = new LinkedList();
		lkd.add(10);
		lkd.add(20);
		lkd.add(30);
       return lkd;
	}
	
	public static void main(String[] args) {
		LinkedListDemo3 linkedlistdemo=new LinkedListDemo3();
		LinkedList result=linkedlistdemo.getLinkedListDemo();
		System.out.println(result);
	}
}
