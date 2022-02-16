package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DemoCookie3Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DemoCookie3Delete() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
     	out.println("<h2>Welcome to third cookie</h2>");
     	
     	//retrive cookies 
     	Cookie []c=request.getCookies();
     	for(Cookie p:c)
     	{
     		out.println(p.getName()+"   "+p.getValue());
     	}
     	
     	
     	out.println("</html></body>");	
	
	
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
