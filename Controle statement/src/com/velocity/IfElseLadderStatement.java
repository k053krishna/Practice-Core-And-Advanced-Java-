package com.velocity;

public class IfElseLadderStatement {

	public static void main(String[] args) {

		int marks = 65;
		if (marks >= 80) {
			System.out.println("a++ grade");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("a grade");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("b grade");

		} else if (marks >= 50 && marks < 60) {
			System.out.println("c grade");
		} else {
			System.out.println("fail");
		}
	}
}
