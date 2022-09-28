package Assighment4;

import java.util.Scanner;

public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter the num");
	Scanner scanner=new Scanner(System.in);
	int num=scanner.nextInt(); //20
	for(int i=1;i<=num;i++) { //1<20,2<20,3<20,4<20
		int count=0;//0,0,0,0
		for(int j=2;i>j;j++) { //1>2,2>2,3>2,
         if (i%j==0) {   //3%2=1,
				count++;    //1+
			}
		}
	if (count==0) {//
		System.out.println(i);//1,3,
	}
		
	}
}

}

