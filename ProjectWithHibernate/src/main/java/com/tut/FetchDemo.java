package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo 
{
	public static void main(String[] args)
	{
		Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        
        //Get method :
        Employee emp=(Employee)session.get(Employee.class,103);
        System.out.println(emp);
        
        
        
        //Load method:
        
        Address ads=(Address)session.get(Address.class,1);
        System.out.println(ads);
        System.out.println(ads.getCity()+"   "+ads.getStreet());  
        
        
        session.close();
        factory.close();
	}

}
