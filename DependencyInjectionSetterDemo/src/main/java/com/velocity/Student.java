package com.velocity;

public class Student {

	private String city;

	public void setCity(String city) {
		this.city = city;
	}

	public void getDiplayMessage(String name) {
	System.out.println("Hello," +name+ "," + city );
	}

}