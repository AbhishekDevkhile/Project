package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * Third Way---Servlet(implementing Servlet interface)
 * */

public class ThirdServlet implements Servlet {

   private ServletConfig cfg;
   
    public ThirdServlet() {
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		this.cfg=config;
	}

	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public ServletConfig getServletConfig() {
		   
		return cfg;
	}

	
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null; 
	}

	
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		HttpServletRequest req=(HttpServletRequest) request;                               //casting perform
		HttpServletResponse resp=(HttpServletResponse) response;                            //casting perform
		PrintWriter out=resp.getWriter();
		out.println("Welcome to third servlet");
		out.println("User name"+req.getParameter("fname"));
		
		
	}

}
