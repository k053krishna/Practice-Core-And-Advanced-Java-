package com.velocity.variable;

public class Y extends X {
	int x = 25;
	
    public void test() {
    	int x=30;
    	// case1
    	X p= new X();
    	System.out.println("parent class x variable>>" + p.x);
    	// case2
    	System.out.println("super class variable x= " +super.x);
    }
}
