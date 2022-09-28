package com.assighment23;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListHashMapImp {

	public static void main(String[] args) {
		ArrayList<String> maharastra=new ArrayList<String>();
		maharastra.add("Mumbai");
		maharastra.add("Pune");
		maharastra.add("Nagpur");
		
		ArrayList<String> karnatka=new ArrayList<String>();
		karnatka.add("Banglore");
		karnatka.add("Mysore");
		
		ArrayList<String> madhyapradesh=new ArrayList<String>();
		madhyapradesh.add("Bhopal");
		madhyapradesh.add("Indore");
		
		HashMap<String, ArrayList<String>> state=new HashMap<String,ArrayList<String>>();
		state.put("Maharastra", maharastra);
		state.put("Karnataka", karnatka);
		state.put("Madhya Pradesh", madhyapradesh);
		
		HashMap<String, HashMap<String, ArrayList<String>>> country=new HashMap<String,HashMap<String, ArrayList<String>>>();
		country.put("INDIA" ,state);
		
		Set <String> s=country.keySet();
		for(String p:s) {
			System.out.println(p);
			System.out.println(country.get(p));
		}
		
		
	}
}
