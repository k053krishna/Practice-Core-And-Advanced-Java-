package com.velocity1;

public class C {
	int id;
	String empName;
	String empCity;

	@Override
	public String toString() {
		return "C [id=" + id + ", empName=" + empName + ", empCity=" + empCity + "]";
	}

	public static void main(String[] args) {
     C c= new C();
     c.id=10;
     c.empName="ram";
     c.empCity="pune";
     System.out.println(c);
	}
}
