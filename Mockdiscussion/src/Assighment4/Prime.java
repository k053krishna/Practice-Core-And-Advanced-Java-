package Assighment4;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	System.out.println("Enter the number");
	Scanner scanner=new Scanner(System.in);
	int  num=scanner.nextInt();
	int count=0;
	for(int i=1;i<=num;i++) {
		if (num%i==0) {
			count++;
			
		}
		
	}
	if(count<=2) {
		System.out.println("num is a prime no");
	}else {
		System.out.println("num is not a prime num");
	}
}
}
