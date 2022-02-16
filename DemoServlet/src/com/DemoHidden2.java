package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoHidden2 extends HttpServlet {


	private static final long serialVersionUID = 1L;
	
			@Override
			protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			 
				resp.setContentType("text/html");
				PrintWriter out=resp.getWriter();
				//String t1=req.getParameter("t1");
				String uname=req.getParameter("username");
			
				out.println("<html><body>");
				out.println("<h2> welcome User"+uname+"</h2>");
				//out.println("<h2> Text field"+t1+"</h2>");
				
				out.println("<h2> Welcome HiddeenFromField 2</h2>");
			
			
			}
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
				doGet(req,resp);
			}	

}
