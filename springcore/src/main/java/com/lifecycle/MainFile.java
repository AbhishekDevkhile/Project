package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {

	public static void main(String[] args)
{
		
	    AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/lifecycle/LifeCycleConfig.xml");
       
	    
	    
	    Cake c=(Cake) context.getBean("C1");
	    
	    System.out.println(c);
	 
	    // registering shoutdown hook for XML method,interface & Annotation
	    context.registerShutdownHook();
	    
	    System.out.println("---------------------------------------------------");
	   Pepsi p= (Pepsi) context.getBean("P1");
	   
	   System.out.println(p);
	    
	    System.out.println("---------------------------------------------------");
	    
	     Subject s= (Subject) context.getBean("S1");
	     System.out.println(s);
	}

}
