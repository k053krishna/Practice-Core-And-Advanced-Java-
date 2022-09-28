package com.assighment7;

import java.util.Scanner;

/*Design method public int getNumberCube(int num), return int
value to that
method and result should be print into main method
*/
public class CubeNumber {
	public int getNumberCube(int num) {
		int result=num*num*num;
		return result;
	}
	public static void main(String[] args) {
		System.out.println("Enter the number>>>");
		CubeNumber cubeNumber=new CubeNumber();
		Scanner scanner=new Scanner(System.in);
		int number=scanner.nextInt();
		int cube=cubeNumber.getNumberCube(number);
		System.out.println("number of cube is>>>" +cube);
	}
}
