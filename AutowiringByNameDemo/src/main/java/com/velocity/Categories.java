package com.velocity;

public class Categories {

	private String name;
	private Policy policy;//injecting object here(secondry data type)
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	
	public void show() {
		System.out.println("Categories name.." +name);
		System.out.println("Policy name.." +policy.getPlanName());
		System.out.println("Policy amounr.." +policy.getPlanAmount());
	}
}
