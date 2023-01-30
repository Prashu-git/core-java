package com.xworkz.servlet.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/all")
public class FavPersonServlet extends HttpServlet {

	public FavPersonServlet() {
		System.out.println("inside FavPersonServlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String reason = req.getParameter("reason");
		String address = req.getParameter("address");

		System.out.println(fname + lname + gender + reason + address);

		req.setAttribute("fname", fname);
		req.setAttribute("lname", lname);
		req.setAttribute("email", email);
		req.setAttribute("gender", gender);
		req.setAttribute("reason", reason);
		req.setAttribute("address", address);

		RequestDispatcher requestDispatcher = req.getRequestDispatcher("display.jsp");
		requestDispatcher.forward(req, resp);
	}

}
