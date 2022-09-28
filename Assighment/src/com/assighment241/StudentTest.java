package com.assighment241;

import java.util.ArrayList;
import java.util.Collections;

public class StudentTest {


	public static void main(String[] args) {
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(10, 700000));
		al.add(new Student(11, 5500));
		al.add(new Student(12, 890000));
		al.add(new Student(13, 51000));
		al.add(new Student(14, 800000));
		al.add(new Student(15, 650));
		
		Collections.sort(al,new SalaryComparator());
		
		for(Student student:al ) {
			System.out.println(student);
		}
	}
}

