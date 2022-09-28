package com.velocity.comparable;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	int salary;

	public Employee(int id, String name,int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public int compareTo(Employee employee) {
		if (salary == employee.salary) {
			return 0;
		} else {
			if (salary> employee.salary) {
				return 1;
			} else {
				return -1;
			}
		}

	}

}
