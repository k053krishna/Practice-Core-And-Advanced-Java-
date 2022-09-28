package com.assighment20;
/*
 Design the method for ArrayList<Employee> which returns 
the list of employee and print that data. 
 */
public class Employee {

	int id;
	String name;
	String salary;
	String city;
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", city=" + city + "]";
	}

	public Employee (int id,String name,String salary,String city) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.city=city;
	}
}
