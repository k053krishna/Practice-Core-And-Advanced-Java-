package com.velocity;

public class Employee {
	int id;
	String employeeName;
	String employeeCity;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", employeeName=" + employeeName + ", employeeCity=" + employeeCity + "]";
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.id = 10;
		employee.employeeName = "Krishna";
		employee.employeeCity = "pune";
		System.out.println(employee.toString());
		
		
		
	}



	
}
