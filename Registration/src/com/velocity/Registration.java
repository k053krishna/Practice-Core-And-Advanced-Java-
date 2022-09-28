package com.velocity;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Registration() {
		super();

	}

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user=request.getParameter("username");
		System.out.println("username is ..." +user);
		String pass=request.getParameter("password");
		System.out.println( "password is..." +pass);
		
		if((user.equals("velocity"))&&(pass.equals("pune"))){
			//System.out.println("sucessfully login");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("sucess.jsp");
			requestDispatcher.forward(request, response);
		}else {
			//System.out.println("Incorect username or passpord");
			RequestDispatcher requestDispatcher=request.getRequestDispatcher("failure.jsp");
			requestDispatcher.forward(request, response);
		}
	}

}
