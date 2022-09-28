package com.velocity;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FetchServlet")
public class FetchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// PrintWriter out=response.getWriter();
				List<Employee> list = DatabaseConnection.getAllEmployeeData();
				System.out.println("List>>>>" + list);
	}

}
