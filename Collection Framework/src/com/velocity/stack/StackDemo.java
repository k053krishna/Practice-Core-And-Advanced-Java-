package com.velocity.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack stack =new Stack();
		stack.push("j");
		stack.push("k");
		stack.push("m");
		System.out.println(stack);
		System.out.println(stack.search("x"));
	}
}
