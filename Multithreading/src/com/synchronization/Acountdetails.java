package com.synchronization;

public class Acountdetails extends Thread{

	Account account =new Account();
	
	
	public void run() {
		
	   for(int x=0;x<5;x++) {
		   makeWithdraw(500);
		if(account.getBalance()<=0) {
			System.out.println(" acoount is overdrawn ");
		}
	}
		
	}

	private synchronized void makeWithdraw(int amt) {
		if(account.getBalance()>=amt) {
			System.out.println(Thread.currentThread().getName() 
					+" is going to withdraw =>>>");
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
       int bal=account.getWithdraw(amt);
       System.out.println(Thread.currentThread().getName()
    		   + " complete the withdraw=>>" +bal);
	}
}
