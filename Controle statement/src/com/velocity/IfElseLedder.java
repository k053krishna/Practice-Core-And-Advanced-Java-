package com.velocity;

public class IfElseLedder {
	public static void main(String[] args) {
     int marks=72;
     if(marks>80) {
    	 System.out.println("A grade");
     }else if(marks>=70 && marks<80) {
    	 System.out.println("B grade");
     }else if(marks>=60 && marks<70) {
    	 System.out.println("C grade");
     }else if(marks>=50 && marks<60) {
    	 System.out.println(" D grade");
     }else if(marks>=40 && marks<50) {
     System.out.println("E grade");
	}else {
		System.out.println("incorrect input");
	}
		}
}

