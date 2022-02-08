package com.ConstructorInj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoConst {

	public static void main(String[] args) {
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/ConstructorInj/ConstructorConfig.xml");
          
		  Person p=  (Person) context.getBean("Person1");
		  
		  System.out.println(p.getpId());
		  System.out.println(p.getpName());
		  
		  
		  System.out.println(p);
		 
	}

}
