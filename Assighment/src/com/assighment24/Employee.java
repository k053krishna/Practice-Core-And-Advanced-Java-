package com.assighment24;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	String city;
	
	public Employee(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCity() {
		return city;
	}

	@Override
	public int compareTo(Employee emp) {
		return this.name.compareTo(emp.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
    
	
}
