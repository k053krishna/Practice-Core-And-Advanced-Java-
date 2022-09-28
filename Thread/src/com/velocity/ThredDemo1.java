package com.velocity;

public class ThredDemo1 implements Runnable {

	public static void main(String[] args) {
		ThredDemo1 td = new ThredDemo1();
		Thread thread = new Thread(td);
		thread.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
