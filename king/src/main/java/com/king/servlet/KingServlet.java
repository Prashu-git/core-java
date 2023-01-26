package com.king.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (loadOnStartup = 1, urlPatterns = "/king")
public class KingServlet extends HttpServlet {
	
	public KingServlet() {
		
		System.out.println("inside KingServlet()");
	}

	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("running KingServlet init......");
		
	}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running KingServlet doGet()");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("king_Name");
		String Region = req.getParameter("region");
		String NoOfQueens = req.getParameter("NoOfQueens");
		String DOB = req.getParameter("dateofbirth");
		String DOD = req.getParameter("DateOfDeath");
		System.out.println( name +Region+NoOfQueens +DOB+DOD );

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("King name " + name + " is saved succesfuly");

	}
}
