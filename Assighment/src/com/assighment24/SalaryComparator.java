package com.assighment24;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.salary.compareTo(student2.salary);
		
	}

}
