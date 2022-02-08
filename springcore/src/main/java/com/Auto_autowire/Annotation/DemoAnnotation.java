package com.Auto_autowire.Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoAnnotation {

	public static void main(String[] args) {
	 	ApplicationContext context= new ClassPathXmlApplicationContext("com/Auto_autowire/Annotation/AnnotationConfig.xml");

	 	Person p=context.getBean("per1",Person.class);
	 	System.out.println(p);
	}

}
