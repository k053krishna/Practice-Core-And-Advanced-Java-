package com.velocity.comparator;

import java.util.ArrayList;
import java.util.Collections;


public class Test {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"ram",9000));
		al.add(new Student(102,"ashok",3000));
		al.add(new Student(103,"ajay",8000));
		
		Collections.sort(al,new SalaryComparator());
		for(Student student:al) {
			System.out.println(student);
		}
	}
}
