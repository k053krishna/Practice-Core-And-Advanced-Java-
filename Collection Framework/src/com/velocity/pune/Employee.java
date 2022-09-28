package com.velocity.pune;

public class Employee {

	int id;
	String name;
	String salary;

	public Employee(int empId, String empName, String empSalary) {
		this.id = empId;
		this.name = empName;
		this.salary = empSalary;

	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

}
