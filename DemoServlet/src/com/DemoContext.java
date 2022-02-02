package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoContextConfig
 */

public class DemoContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DemoContext() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();                               //fetch data
		ServletContext ctx=getServletContext();                              //create object of servletContext
		String cmail=ctx.getInitParameter("companymail");                        //initialize parameter
		String url=ctx.getInitParameter("url");                                //initialize parameter
		out.println("Company mail"+cmail);	 
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
