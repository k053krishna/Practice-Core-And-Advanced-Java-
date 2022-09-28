package com.velocity.stack;

import java.util.Stack;

public class StackDemo1 {

	// Design method which return stack object
	public static Stack getStackData() {
		Stack stack =new Stack();
		stack.add(10);
		stack.add(20);
		stack.add(30);
		stack.add(40);
		return stack;
	}
	public static void main(String[] args) {
		Stack st=getStackData();
		System.out.println(st);
	}
}
