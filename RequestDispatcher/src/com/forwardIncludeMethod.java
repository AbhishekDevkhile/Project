 package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.SendResult;

/**
 * Servlet implementation forward and include Method  amd sendRedirect()
 * 
 * write a setAttribute(String key,Object value)
 * 
 */

public class forwardIncludeMethod extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public forwardIncludeMethod() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname=request.getParameter("fname");                                                //Extract data
		String pass=request.getParameter("pass");
		
		PrintWriter out= response.getWriter();
		
		ArrayList<String> al=new ArrayList<>();
		al.add("Abhi");
		al.add("Neha");
		al.add("Nitin");
		
		
		if(uname.equalsIgnoreCase("Admin") && pass.equalsIgnoreCase("1234"))
		{
			//Forward() method:-----------------------
			RequestDispatcher rd=request.getRequestDispatcher("Welcome");                              //pass on WelcomeServlet  
			rd.forward(request, response);                                          //Forward()
			
			
			//setAttribute(String key,Object value):---------------------
			request.setAttribute("studlist",al);
			
			
			/*
			//SendRedirect() method:------------
			
			response.sendRedirect("Welcome");                                       //Or
			//response.sendRedirect("http://google.com"); 
			*/
		}
		else
		{
			out.println("Unseccessful Login");
			out.println("Please re-enter the details:");
			
			//include() method:-------------
			RequestDispatcher rd=request.getRequestDispatcher("Home.html");
			rd.include(request, response);                                            //include()
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
