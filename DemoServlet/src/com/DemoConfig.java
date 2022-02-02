package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DemoConfig
 */

public class DemoConfig extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public DemoConfig() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();                               //fetch data
		ServletConfig cfg=getServletConfig();                              //create object of servletContext
		String nm=cfg.getInitParameter("Myname");                        //initialize parameter
		out.println("Data at config username"+nm);	
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
