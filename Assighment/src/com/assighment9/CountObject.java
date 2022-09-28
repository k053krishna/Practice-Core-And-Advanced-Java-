package com.assighment9;

public class CountObject {
	static int count;

	public CountObject() {
		count++;
	}

	public static void main(String[] args) {
		CountObject countObject1 = new CountObject();// constroter invoke
		CountObject countObject2 = new CountObject();
		CountObject countObject3 = new CountObject();
		CountObject countObject4 = new CountObject();
		CountObject countObject5 = new CountObject();
		CountObject countObject6 = new CountObject();
		System.out.println("no of object is>>>" +count);
	}


	}

