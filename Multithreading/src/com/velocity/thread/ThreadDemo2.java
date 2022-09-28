package com.velocity.thread;

public class ThreadDemo2 extends Thread {

	public static void main(String[] args) {
		
		ThreadDemo2 thread=new ThreadDemo2();
		System.out.println(thread.getId());
		System.out.println(thread.getName());
		System.out.println(thread.getPriority());
		System.out.println(thread.getState());
	}
}
