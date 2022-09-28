package com.velocity.linkedhashset;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo3 {

	public static void main(String[] args) {
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		lhs.add("Ram");
		lhs.add("Sita");
		lhs.add("Laxman");
		Iterator itr=lhs.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
