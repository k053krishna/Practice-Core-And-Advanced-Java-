package com.assighment21;

import java.util.ArrayList;

public class Sample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		al.add("Red");
		al.add("Blue");
		al.add("Red");
		al.add("Blue");
		al.add("Green");
		System.out.println("Before shorting");
		System.out.println(al);
		ArrayList<String> al1 = new ArrayList<String>();
		for (String s : al) {
			if (s.equals("Red")) {
				al1.add("Red");
			}
		}
		for (String s : al) {
			if (s.equals("Blue")) {
				al1.add("Blue");
			}
		}
		for (String s : al) {
			if (s.equals("Green")) {
				al1.add("Green");
			}
		}

		System.out.println("After shorting");
		System.out.println(al1);
	}
}
