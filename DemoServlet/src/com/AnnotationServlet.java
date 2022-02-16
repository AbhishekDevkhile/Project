package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




//@WebServlet("/anno")
//*****OR***********
@WebServlet(urlPatterns={"/anno","/hello"},
initParams={
		@WebInitParam(name="user",value="Abhi"),
		
		@WebInitParam(name="email",value="Abhi@gmail.com")
		
},
loadOnStartup=1
		)

public class AnnotationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AnnotationServlet() {
		System.out.println("in annotated servlet");
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		PrintWriter out=response.getWriter();
		out.println("Welcome to demo annotation"+request.getParameter("fname"));
		
		
		//create object of servletconfig for @WebServlet(urlPatterns)
		
		ServletConfig cfg=getServletConfig();
		out.println("Init param"+cfg.getInitParameter("user"));
		out.println("Init param"+cfg.getInitParameter("email"));
				
	}

	
}
