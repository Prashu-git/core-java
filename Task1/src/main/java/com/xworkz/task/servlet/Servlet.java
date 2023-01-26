package com.xworkz.task.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(loadOnStartup = 1, urlPatterns = "/all")
public class Servlet extends HttpServlet {

	public Servlet() {
		// TODO Auto-generated constructor stub

		System.out.println("inside servlet()" + this.getClass().getSimpleName());
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		// super.init();

		System.out.println("inside init method");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doGet(req, resp);
		String data = "Pleas complet the task";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

		System.out.println("Running good");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPost(req, resp);
		System.out.println("Running doPost");

		String data = "The task is posted";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doDelete(req, resp);
		System.out.println("Running doDelete");

		String data = "Deleting the data";
		// System.out.println(data);
		PrintWriter printWriter = resp.getWriter();
		printWriter.print(data);
		resp.setContentType("text/plain");

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse http) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doPut(req, resp);
		System.out.println("Running doPut");
		String string2 = "Adding some data";
		PrintWriter printWriter = http.getWriter();
		printWriter.print(string2);
		http.setContentType("text/plain");

	}

	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse httpServletResponse)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doTrace(req, resp);
		System.out.println("Running doTrace");
		String string1 = "To trace";
		// System.out.println(data);
		PrintWriter pWriter = httpServletResponse.getWriter();
		pWriter.print(string1);

		httpServletResponse.setContentType("text/plain");

	}

	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse rip) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// super.doOptions(req, resp);
		System.out.println("Running doOptions");
		String string = "Options are required";
		PrintWriter writer = rip.getWriter();
		writer.print(string);
		rip.setContentType("text/plain");

	}

	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doHead(req, resp);
		
		System.out.println("Running doHead");
		String string4 = "Open ur head";
		PrintWriter writer = resp1.getWriter();
		writer.print(string4);
		resp1.setContentType("text/plain");

	}
}
