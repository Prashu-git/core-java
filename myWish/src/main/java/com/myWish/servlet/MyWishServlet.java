package com.myWish.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/myWish")
public class MyWishServlet extends HttpServlet {

	public MyWishServlet() {

		System.out.println("inside MyWishServlet()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running MyWishServlet init .........");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running MyWishServlet doGet..........");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		String weight = req.getParameter("weight");
		String DOB = req.getParameter("dateofbirth");
		String Height = req.getParameter("Height");
		String Awards = req.getParameter("awards");
		String achievement = req.getParameter("achievement");
		String role = req.getParameter("role");
		String goal = req.getParameter("goal");
		String girlfriend = req.getParameter("girlfriend");
		String boyfriend = req.getParameter("boyfriend");
		String father = req.getParameter("father");
		String mother = req.getParameter("mother");
		String sister = req.getParameter("sister");
		String brother = req.getParameter("brother");
		String sports = req.getParameter("sports");
		String grandfather = req.getParameter("grandfather");
		String grandmother = req.getParameter("grandmother");
		String salary = req.getParameter("salary");
		String career = req.getParameter("career");

		System.out.println(
				name + age + weight + DOB + Height + Awards + achievement + role + goal + girlfriend + boyfriend
						+ father + mother + sister + brother + sports + grandfather + grandmother + salary + career);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print(" Name " + name + " is saved succesfuly");
	}

}
