package Assighment4;

import java.util.Scanner;

public class Reverse {
public int reverseNumber(int num) {
	int reverse=0;
	int sum=0;
	while(num!=0) {
		reverse=reverse*10;
		reverse=reverse+num%10;
		num=num/10;
	}
	return reverse;
}
public static void main(String[] args) {
	Reverse reverse =new Reverse();
	System.out.println("Enter the reverse number");
	Scanner scanner =new Scanner(System.in);
	int result=scanner.nextInt();
	int res=reverse.reverseNumber(result);
	System.out.println("Reverse number is >> " +res);
	
	
}
}
