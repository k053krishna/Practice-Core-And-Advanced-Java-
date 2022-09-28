package com.assighment21;

import java.util.Vector;

public class SampleVector {

	public static void main(String[] args) {
		Vector<String> al = new Vector<String>();
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
		Vector<String> al1 = new Vector<String>();
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
