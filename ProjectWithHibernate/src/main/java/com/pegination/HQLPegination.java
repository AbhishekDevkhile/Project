package com.pegination;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLPegination {

	public static void main(String[] args) {
		System.out.println("Start");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session s=factory.openSession();
	
		//implementing pagination
		
		Query q=s.createQuery("from StudentPegi");
		
		q.setFirstResult(0);
		q.setMaxResults(5);
		
		List<StudentPegi> l1=q.list();                         //create List of student and display it
		for(StudentPegi ll:l1)
		{
			System.out.println(ll.getSid()+":"+ll.getSname()+":"+ll.getScity());
		}
		
		
		
		s.close();
        factory.close();
        System.out.println("Done");
	}

}
