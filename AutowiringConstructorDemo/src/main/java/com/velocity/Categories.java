package com.velocity;

public class Categories {

	private String name;
	private Policy policy;
	public Categories(String name, Policy policy) {
		
		this.name = name;
		this.policy = policy;
	}
	
	public void show() {
		System.out.println("catories name " +name);
		System.out.println("Policy name " +policy.getPlaneName());
		System.out.println("Policy Amount " +policy.getPlanAmount());
	}
	
}
