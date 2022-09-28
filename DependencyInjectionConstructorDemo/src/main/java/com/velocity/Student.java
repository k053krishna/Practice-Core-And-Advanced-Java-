package com.velocity;

public class Student {

	private String name;
	private String age;
	private String city;
	
	public Student(String name, String age, String city) {
		
		this.name = name;
		this.age = age;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
}
