package com.assighment241;

public class Student {

	int id;
	int salary;
	public Student(int id, int salary) {
		
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", salary=" + salary + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
