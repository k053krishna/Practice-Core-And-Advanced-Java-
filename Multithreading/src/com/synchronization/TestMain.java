package com.synchronization;

public class TestMain {

	public static void main(String[] args) {
		Acountdetails accountdetails =new Acountdetails();
		
		Thread thread1=new Thread(accountdetails);
		Thread thread2=new Thread(accountdetails);
		thread1.setName("Krishna");
		thread2.setName("Arun");
		thread1.start();
		thread2.start();
	}
}
