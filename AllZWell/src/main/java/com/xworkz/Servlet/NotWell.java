package com.xworkz.Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 6, urlPatterns = "/Breeza")

public class NotWell extends HttpServlet {

	public NotWell() {
		// TODO Auto-generated constructor stub

		System.out.println("Inside NotWell()");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);

		System.out.println("Running");
	}

}
