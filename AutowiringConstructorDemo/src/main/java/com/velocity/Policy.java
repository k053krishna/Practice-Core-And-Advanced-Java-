package com.velocity;

public class Policy {

	private String planeName;
	private String planAmount;

	public Policy(String planeName, String planAmount) {

		this.planeName = planeName;
		this.planAmount = planAmount;
	}

	public String getPlaneName() {
		return planeName;
	}

	public String getPlanAmount() {
		return planAmount;
	}
}
