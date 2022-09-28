package com.velocity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String first = request.getParameter("firstname");
		String last = request.getParameter("lastname");
		String add = request.getParameter("address");
		String city = request.getParameter("city");
		String salary = request.getParameter("salary");

		// processing the data
		// how to set the value into employee object
		Employee emp = new Employee();
		emp.setFirstName(first);
		emp.setLastName(last);
		emp.setAddress(add);
		emp.setCity(city);
		emp.setSalary(salary);
		DatabaseConnection.save(emp); // method calling
	}

}
