package com.velocity.coustom;

public class Demo {
public static void main(String[] args) {
	try {
		throw new Example("invilad input");
	}catch(Exception e){
		//System.out.println(e);
		//e.getMessage();
		e.printStackTrace();
	}
}
}
