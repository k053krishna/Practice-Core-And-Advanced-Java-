package com.velocity;

public class Employee {

	int id = 10;
	String name = "sachin";
	String city = "pune";

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Employee addEmployee() {
		Employee emp = new Employee();
		// System.out.println(emp);
		emp.setId(id);
		emp.setName(name);
		emp.setCity(city);

		return emp;
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.addEmployee();
		System.out.println(e);

	}
}
