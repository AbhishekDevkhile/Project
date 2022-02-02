package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/*
 * Second way---GenericServlet
 * */

public class SecondServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;
       
   public void service(ServletRequest req, ServletResponse resp) throws IOException
   {
	   PrintWriter out=resp.getWriter();
	   String u=req.getParameter("fname");
	   out.println("Welcome user "+u);	
	   
   }
}
