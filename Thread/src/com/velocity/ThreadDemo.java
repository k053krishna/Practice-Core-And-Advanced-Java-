package com.velocity;

public class ThreadDemo extends Thread {
	
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		ThreadDemo td=new ThreadDemo();
		td.start();
	}

}
