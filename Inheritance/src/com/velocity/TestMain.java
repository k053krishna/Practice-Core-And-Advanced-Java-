package com.velocity;

public class TestMain {

	public static void main(String[] args) {
		// how to create object of class X
		// Scenario-1
/*	
		 X x = new X();
		 System.out.println(x.a);
		 System.out.println(x.b); 
		// System.out.println(x.c);
		 x.m1();
		 x.m2();
		  // x.m3();

	
		  //Scenario-2 --
		 Y y=new Y();
		 System.out.println(y.a);
		 System.out.println(y.b); 
		 System.out.println(y.c);
		 y.m1(); 
		 y.m2();
		 y.m3();
	*/	
		// scenario-3
	
	     X x=new Y();//reverse is not possible in java 
	     System.out.println(x.a);
		 System.out.println(x.b); 
		 //System.out.println(x.c); 
		 x.m1();
		 x.m2(); 
		// x.m3();
	
		
		 
		// Scenario-4 (Note- 3rd and 4th scenario both are same)
	/*	X x = new X();
		Y y = new Y();
		x = y;
		System.out.println(x.a); // 10
		System.out.println(x.b); // 20
		// System.out.println(x.c); //
		x.m1();
		x.m2();
		// x.x3();
*/
		// Scenario-5- 2nd and 5th both are same
	/*
		 X x=new Y(); 
		 Y y=new Y();
		 y=(Y)x; //Type casting System.out.println(y.a);
		  System.out.println(y.b);
		  System.out.println(y.c); 
		  y.m1();
		  y.m2();
		  y.m3();
		*/ 
		// Scenario-6-
		// X x=new Y();
		// Y y=new X(); //super class cant be assigned to sub class
	}

}
