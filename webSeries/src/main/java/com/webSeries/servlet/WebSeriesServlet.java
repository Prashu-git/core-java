package com.webSeries.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/webSeries")
public class WebSeriesServlet extends HttpServlet {
	public WebSeriesServlet() {
		System.out.println("inside WebSeriesServlet()");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running WEBSERIES init......");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Running WebSeriesServlet doGet()");
		System.out.println(Thread.currentThread().getName());
		String name = req.getParameter("webSeries_Name");
		String language = req.getParameter("webSeries_Language");
		String episodes = req.getParameter("webSeries_Episodes");
		String OTT = req.getParameter("webSeries_OTT");
		String Budget = req.getParameter("webSeries_Budget");
		System.out.println(name + language + episodes + OTT + Budget);

		PrintWriter printWriter = resp.getWriter();
		printWriter.print("Web Series Name " + name + "is saved succesfuly");

	}

}
