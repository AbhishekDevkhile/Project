package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Collection1 {

	public static void main(String[] args) {
		
		 ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collection/CollectionConfig.xml");
		 
		 System.out.println("innnnn");
		 Employee emp= (Employee) context.getBean("Emp11");
		 
		 System.out.println(emp.getEmpName());
		 System.out.println(emp.getPhones());
		 System.out.println(emp.getAddresses());
		 System.out.println(emp.getCourses());
		
	}

}
