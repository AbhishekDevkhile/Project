package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Start..." );
        
         ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/config.xml");
         
         Student student=(Student) context.getBean("student1");
         Student student2=(Student) context.getBean("student2");
         
         System.out.println(student);
         System.out.println(student2);
         
    }
}
