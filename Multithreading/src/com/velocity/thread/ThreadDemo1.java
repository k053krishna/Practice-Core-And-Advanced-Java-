package com.velocity.thread;

public class ThreadDemo1 implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		ThreadDemo1 thread = new ThreadDemo1();
		Thread t = new Thread(thread);
          t.start();
	}

}