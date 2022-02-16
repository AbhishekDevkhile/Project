package com.collection.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoStandalone {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/collection/standalone/ConstructorConfig.xml");

		Person p=(Person) context.getBean("person2");
		System.out.println(p);
		System.out.println("display util package name::"+p.getFriends().getClass().getName());               //display util package name
	System.out.println("------------------------------------------------------------------------------");

		System.out.println(p.getFeesStructor());
		System.out.println("display util package name::"+p.getFeesStructor().getClass().getName());               //display util package name
	
	System.out.println("--------------------------------------------------------------------------------");	
		System.out.println(p.getProperties());
		System.out.println(p.getProperties().getClass().getName());
		
		
		
		
	}

}
