package com.velocity;

public class TestMain {
public static void main(String[] args) {
	/*
	//case1;
	X x= new X();
	System.out.println(x.a);
	System.out.println(x.b);
	x.m1();
	x.m2();
	*/
	//case2
	/*
	Y y= new Y();
	System.out.println(y.a);
	System.out.println(y.b);
	System.out.println(y.c);
	y.m1();
	y.m2();
	y.m3();
	*/
	
	//case3
	/*
	X x=new Y();
	System.out.println(x.a);
	System.out.println(x.b);
	x.m1();
	x.m2();
	*/
	//case4
	/*
	X x=new X();
	Y y = new Y();
	x=y;
	System.out.println(x.a);
	System.out.println(x.b);
    x.m1();
    x.m2();
    */
	//case5
	X x= new Y();
	Y y = new Y();
	y=(Y)x;
	System.out.println(y.a);
	System.out.println(y.b);
	System.out.println(y.c);
	y.m1();
	y.m2();
	y.m3();
	
	
}
}
