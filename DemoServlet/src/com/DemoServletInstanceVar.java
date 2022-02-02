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
 * Servlet implementation class DemoServletInstanceVar----   C type of Instance variable is created
 */

public class DemoServletInstanceVar extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	int c=0;                                                           // C type of variable is declared 
	   
	public DemoServletInstanceVar()                         //invoke constructor
	{
		System.out.println("in default First");
	}
	
	   public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	   {
		   c++;                                                    //incerement
		     PrintWriter out= response.getWriter();
		 //    out.println("Welcome to first Session");
		     
		    String uname= request.getParameter("fname");
		    String pass=request.getParameter("pass");
		    out.println("<html>");
		    out.println("<body bgcolor='Green' >");
		    
		    out.println("<h1>Welcome to online session"+uname+"</h1>");
		    out.println("<h3> Value of c is:"+c+"</h3>");
		    
		    
		    //ServletContext
		    ServletContext ctx=getServletContext();                              //create object of servletContext
			String cmail=ctx.getInitParameter("companymail");                        //initialize parameter
			String url=ctx.getInitParameter("url");                                //initialize parameter
			out.println("Company mail"+cmail);	 
			
			
		    out.println("</body></html>");
	   }
	   
	   public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException
	   {
		    doGet(request,response);
	   }

}
