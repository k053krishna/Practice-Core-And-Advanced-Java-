package Assighment4;

import java.util.Scanner;

public class ArmstrongNum {
	public boolean getArmstrongNumber(int num) {
		int tempvalue = num;
		int sum = 0;
		while (num != 0) {
			int remender = num % 10;
			sum = sum + (remender * remender * remender);
			num = num / 10;
		}
		if (sum == tempvalue) {
			return true;
		} else {
			return false;
		}
	}
	public static void main(String[] args) {
		ArmstrongNum ArmstrongNum = new ArmstrongNum();
		System.out.println("Enter the Armstronf number");
		Scanner scanner =new Scanner(System.in);
		int result=scanner.nextInt();
		if(ArmstrongNum .getArmstrongNumber(result)) {
			System.out.println("this is Armstrong number");
		}else {
			System.out.println("this is not a Armstrong number");
		}
	}
}
