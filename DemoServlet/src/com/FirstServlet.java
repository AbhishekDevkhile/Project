package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 First Way--- HttpServlet
 * */

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException
   {
	     PrintWriter out= response.getWriter();
	 //    out.println("Welcome to first Session");
	     
	    String uname= request.getParameter("fname");
	    String pass=request.getParameter("pass");
	    out.println("<html>");
	    out.println("<body bgcolor='Green' >");
	    
	    out.println("<h1>Welcome to online session"+uname+"</h1>");
	    out.println("</body></html>");
   }
   
   public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException
   {
	    doGet(request,response);
   }

}
