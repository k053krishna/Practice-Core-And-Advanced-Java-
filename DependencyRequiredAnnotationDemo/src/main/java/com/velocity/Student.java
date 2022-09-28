package com.velocity;

import org.springframework.beans.factory.annotation.Required;

public class Student {

	private String firstName;
	private String lastName;
	private int rollNo;
	private int age;
	
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Required
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void getStudentData() {
		System.out.println("fristName " +firstName);
		System.out.println("lastName " +lastName);
		System.out.println("Rollnum " +rollNo);
		System.out.println("Age " +age);
	}
	
	
}
