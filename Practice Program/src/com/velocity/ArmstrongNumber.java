package com.velocity;

import java.util.Scanner;

public class ArmstrongNumber {

	public boolean ArmstrongNum(int num) {
		int tempvalue=num;
		int sum=0;
		while(num!=0) {
			int remender=num%10;
			sum=sum+(remender*remender*remender);
			num=num/10;
		}
		if(sum==tempvalue) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber=new ArmstrongNumber();
		System.out.println("Enter the number");
		Scanner scanner =new Scanner(System.in);
        int no=scanner.nextInt();
        if(armstrongNumber.ArmstrongNum(no)) {
        	System.out.println("num is a armstrong number");
        }else {
        	System.out.println("numis not a armstrong number");
        }
	}
}
