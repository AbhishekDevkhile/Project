package com.Autowire.UseXML;
//error:not run
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoXML_Autowire {

	public static void main(String[] args) {
		 ApplicationContext context=new  ClassPathXmlApplicationContext("com/Autowire/UseXML/AutoXmlConfig.xml");

		 Emp e= context.getBean("emp11" ,Emp.class);
		 
		 System.out.println(e);
	}

}
 