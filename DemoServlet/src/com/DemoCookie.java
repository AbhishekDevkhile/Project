package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoCookie  extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String uname=req.getParameter("fname");
		String pass=req.getParameter("pass");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html><body>");
		out.println("<h2> welcome User"+uname+"</h2>");
		out.println("<h2>Cookies Demo</h2>");
		
		//create obj of Cookies
		
		Cookie c=new Cookie("username", uname);
		c.setMaxAge(60*10);                         //set cookie session time
		resp.addCookie(c);
		out.println("<a href='cookie2'>Second Servlet</a>");
		out.println("</body> </html>");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
