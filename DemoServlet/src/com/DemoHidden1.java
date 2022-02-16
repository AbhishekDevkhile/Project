package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DemoHidden1 extends HttpServlet 
{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
		String uname=req.getParameter("fname");
		String pass=req.getParameter("pass");
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		out.println("<html><body>");
		out.println("<h2> welcome User"+uname+"</h2>");
		out.println("<h2> Demo HiddeenFromField</h2>");
		//URL-ReWriting 
		out.println("<a href='hidden2?username="+uname+"'>URL Rewriting</a>");
		
		
		/*//hidden from field 
		out.println("<form  action='hidden2'>");
		out.println("<input type='text' name='t1' >");
		//Add hidden field
		out.println("<input type='hidden' name='username' value=''"+uname+"> ");
		
		out.println("<input type='submit' >");
		*/
		//out.println("<a href='Hidden2'>Second Servlet</a>");
		out.println("</body> </html>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

}
