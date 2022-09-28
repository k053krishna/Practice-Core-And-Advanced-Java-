package com.test.multiple;

public class Test {
	public static Employee getEmployee() {
		int id = 10;
		String name = "Ram";
		String city = "pune";
		return new Employee(id, name, city);// constructor invoke and return multiple value from object

	}
	public static void main(String[] args) {
		Employee e=getEmployee();
		System.out.println("id=" +e.id);
		System.out.println("name=" +e.name);
		System.out.println("city=" +e.city);
		
	}
}
