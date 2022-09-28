package com.velocity;
public class MultiThreading extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			try {
				
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println( +i);
		
		}
		
	}
	public static void main(String[] args) {
		MultiThreading th1 = new MultiThreading();
		MultiThreading th2 = new MultiThreading();
		th1.setName("producer");
		th2.setName("Consumer");
		th1.start();
		th2.start();
	}
}
