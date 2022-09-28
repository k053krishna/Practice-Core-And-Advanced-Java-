package com.assighment24;

public class Student {

	int id;
	String salary;
	
	public Student(int id, String salary) {
		this.id = id;
		this.salary = salary;
	}

	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", salary=" + salary + "]";
	}
	
	
}
