package com;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class LoginFilter implements Filter {

   
    public LoginFilter() {
        
    }

	
	public void destroy() {
	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		/*
		//write pre-processing logic
		System.out.println("pre-Processing");
		chain.doFilter(request, response);
		System.out.println("post=processing");
		//write postprocessing logic
		*/
		
		//write pre-processing logic
				System.out.println("pre-Processing");
				HttpServletRequest req=(HttpServletRequest) request;
				HttpServletResponse responce;
				HttpServletResponse resp=(HttpServletResponse) response;
				HttpSession session=req.getSession(false);
				if(session==null)
				{
					resp.sendRedirect("home.html");
				}
				else
				{
					 resp.getWriter().println("h3>Filter 1  pre processing</h3>");
						chain.doFilter(request, response);	
						resp.getWriter().println("h3>Filter 1 pre processing</h3>");
				}
				
				//write postprocessing logic
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
