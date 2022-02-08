package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/reference/DemoReference.xml");
		
		A temp=(A) context.getBean("aref");
		System.out.println(temp.getX());
		System.out.println(temp.getB().getY());
		
		System.out.println(temp);

	}

}
