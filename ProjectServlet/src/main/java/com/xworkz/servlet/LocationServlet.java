package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {

	public LocationServlet() {
		System.out.println("inside locationServlet ");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running LocationServlet init succesfull......");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running doPost LocationServlet........");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("name");
		String email = req.getParameter("emial");
		String startPoint = req.getParameter("startPoint");
		String destination = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(startPoint);
		System.out.println(destination);
		System.out.println(gender);

		PrintWriter writer = resp.getWriter();
		writer.print("<html>");
		writer.print("<body>");
		writer.print("<h1>");
		if (name.length() > 5) {
			writer.print("<span style='colour:green;'>");
			writer.print("Login Sucessfully " + name);
		} else {
			writer.print("<span style='colour:red;'>");
			writer.print("name should be greateer than 5 charaters");
		}

		writer.print("</h1>");
		writer.print("</body>");
		writer.print("</html>");

	}
}
