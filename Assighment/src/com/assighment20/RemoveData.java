package com.assighment20;

import java.util.ArrayList;

public class RemoveData {

	public static void main(String[] args) {
		 
		ArrayList al=new ArrayList();
		al.add("mumbai");
		al.add("pune");
		al.add("banglore");
		al.add("hydrabad");
		al.add("mumbai");
		
		for(int i=0;i<al.size();i++) {
		al.remove("mumbai");
		}
		System.out.println(al);
	}
}
