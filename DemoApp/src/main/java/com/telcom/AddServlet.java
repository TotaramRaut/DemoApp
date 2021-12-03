package com.telcom;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet 
{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		AddServlet a = new AddServlet();
		a.doGet(req, res);
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int i =Integer.parseInt(req.getParameter("num1"));
		int j =Integer.parseInt(req.getParameter("num2"));
		
		int k = i+j;
		
		PrintWriter out = resp.getWriter();
		out.println("result is " + k);	}
	
}
