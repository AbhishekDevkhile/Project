package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoCascade {

	public static void main(String[] args) 
	{
		System.out.println("Start");
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		Que q1=new Que();
		q1.setQueId(14);
		q1.setQuestion("Birds");
		
		Ans a1=new Ans();
		a1.setAnsId(113);
		a1.setAns("Parrot");
		a1.setQue(q1);
		
		
		Ans a2=new Ans();
		a2.setAnsId(114);
		a2.setAns("Sprow");
		a2.setQue(q1);
		
		List<Ans>list=new ArrayList<Ans>();
		list.add(a1);
		list.add(a2);
		
		q1.setAns(list);
		
		s.save(a2);
	
		s.save(a1);
		s.save(q1);
		
		tx.commit();
		/*
		//fetch data
		Que qq=(Que)s.get(Que.class, 11);
		System.out.println(qq.getQuestion());
		for(Ans aa:qq.getAns())
		{
			System.out.println(aa);
		}
		*/
		
		s.close();
		factory.close();
		System.out.println("Done..");
	}

}
