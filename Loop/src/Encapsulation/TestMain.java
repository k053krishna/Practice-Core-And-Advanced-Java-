
package Encapsulation;

import java.util.Scanner;

public class TestMain {

	private void getUserDetails() {
		System.out.println("Enter the Id>>>");
		Scanner scanner = new Scanner(System.in);
		int id = scanner.nextInt();
		System.out.println("Enter the Name>>>");
		String name = scanner.next();
		System.out.println("Enter the City>>");
		String city = scanner.next();
		
		// how to set the value into employee object-
		//by using setter method
		Employe employe = new Employe();
		employe.setEmployeId(id);
		employe.setEmployeName(name);
		employe.setEmpoyeCity(city);

		// how to get the value from employee object-
		// by using getter method
		System.out.println("Employee id >>> " + employe.getEmployeId());
		System.out.println("Employee Name>>> "+employe.getEmployeName());
		System.out.println("Employee city>>"+employe.getEmpoyeCity());
	}

	public static void main(String[] args) {

		TestMain testMain=new TestMain();
		testMain.getUserDetails();
	}

}
