package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RefDemoCookie  extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html><body>");
     	out.println("<h2>Welcome to second cookie</h2>");
     	
     	//retrive cookies 
     	Cookie []c=req.getCookies();
     	for(Cookie p:c)
     	{
     		out.println(p.getName()+"   "+p.getValue());
     	}
     	
     	//Delete cookie
     /*	
     	Cookie d=new Cookie("username", "");
     	d.setMaxAge(0);
     	resp.addCookie(d);
     */	
     	out.println("<a href='cookie3'>Welcome third Servlet</a>");
     	out.println("</html></body>");	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
