package com.velocity.variabe;

public class Y extends X{
	int x=25;
	
	void test() {
		System.out.println(x);
		int x=30;
		//case1
		Y y = new Y();
		System.out.println("by creating object >> " +y.x);
		
		//case2
		System.out.println("by using this keyword>> " + this.x);
	}

}
