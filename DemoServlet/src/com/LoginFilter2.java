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


@WebFilter("/anno")
public class LoginFilter2 implements Filter {

    
    public LoginFilter2() {
        // TODO Auto-generated constructor stub
    }


	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("pre-Processing");
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse responce;
		HttpServletResponse resp=(HttpServletResponse) response;
		HttpSession session=req.getSession(false);
		 resp.getWriter().println("h3>Filter 2  post processing</h3>");
			chain.doFilter(request, response);	
			resp.getWriter().println("h3>Filter 2  post processing</h3>");
	
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {

	}

}
