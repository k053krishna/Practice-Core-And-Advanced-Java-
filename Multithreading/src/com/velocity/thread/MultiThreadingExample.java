package com.velocity.thread;

public class MultiThreadingExample extends Thread{

	public void run() {
		
		for(int i=1;i<=5;i++) {
			try {
				Thread.sleep(500);//it will pause the threa
				//excuation for millisecond
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		MultiThreadingExample thread1 =new MultiThreadingExample();
		MultiThreadingExample thread2=new MultiThreadingExample();
		thread1.start();
		thread2.start();
	}
}
