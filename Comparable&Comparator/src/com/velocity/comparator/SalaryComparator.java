package com.velocity.comparator;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		//return student1.salary.compareTo(student2.salary);
		if(student1.salary==student2.salary)
			return 0;
		else if(student1.salary < student2.salary)
			return 1;
		else
			return -1;
	}
}
