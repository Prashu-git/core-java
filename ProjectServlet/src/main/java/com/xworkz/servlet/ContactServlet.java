package com.xworkz.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {
	public ContactServlet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String mobile = req.getParameter("mobile");
		String comments = req.getParameter("comments");

		System.out.println(name);
		System.out.println(email);
		System.out.println(mobile);
		System.out.println(comments);

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
	}

}
