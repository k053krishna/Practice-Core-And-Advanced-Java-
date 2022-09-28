package com.velocity;

import java.util.Scanner;

public class StringDemo8 {

    private String getStudentName(String name) {
			return name;
		}
    public static void main(String[] args) {
		StringDemo8 stringDemo8=new StringDemo8();
		System.out.println("Enter the Student name");
		Scanner scanner=new Scanner(System.in);
		String w=scanner.next();
		String v=stringDemo8.getStudentName(w);
		System.out.println("Student name is " +v);
	}
	}

