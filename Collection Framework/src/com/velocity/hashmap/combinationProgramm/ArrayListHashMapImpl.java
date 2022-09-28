package com.velocity.hashmap.combinationProgramm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class ArrayListHashMapImpl {

	public static void main(String[] args) {

		ArrayList<String> computeraccessories = new ArrayList<String>();
		computeraccessories.add("watch");
		computeraccessories.add("speaker");
		computeraccessories.add("laptop");

		ArrayList<String> electronics = new ArrayList<String>();
		electronics.add("printer");
		electronics.add("mous");
		electronics.add("keyboard");

		ArrayList<String> furniture = new ArrayList<String>();
		furniture.add("bad");
		furniture.add("sofa");
		furniture.add("chair");

		HashMap<String, ArrayList<String>> categories = new HashMap<String, ArrayList<String>>();
		categories.put("Computer Accessories", computeraccessories);
		categories.put("Electronics", electronics);
		categories.put("Futniture", furniture);

		HashMap<String, HashMap<String, ArrayList<String>>> eShop = new HashMap<String, HashMap<String, ArrayList<String>>>();
		eShop.put("E Shop", categories);

		Set<String> s = eShop.keySet();
		//for (String str : s) {
			//System.out.println(str);
			//System.out.println(eShop.get(str));
		Iterator itr=s.iterator();
		while( itr.hasNext()) {
			Object str=itr.next();
			System.out.println(str);
			System.out.println(eShop.get(str));
		}
	}
}
