package com.HQL;
import java.util.Arrays;
/*
 * 1.simple HQL queries(Selcet)
 * 2.complex HQL queries (Delete,Update,Join)
 * 
 * */
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.OO.Question;

public class DemoHQL {
	
	public static void main(String[] args) {
		
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session sess=factory.openSession();
		Transaction tx=sess.beginTransaction();

		
		String ss="from Employee1";                                        //HQL syntax
		
	//	String ss="from Employee1 where city='Pune'";           //input from user
		
	//	String ss="from Employee1 where city:x";                 //give x type parameter
		
    //	String ss="from Employee1 as r where r.city=:x and r.name=:y ";  	
		
		
		Query q=sess.createQuery(ss);
		
	//	q.setParameter("x", "Ahmednagar");                        //set value of x(Pass Dynamic value )
	
	//q.setParameter("y", "Abhishek"); 	                           //set value of y(Pass Dynamic value )
		
	//	System.out.println(q.uniqueResult());
		 
		
		List<Employee1> list=q.list();
		for(Employee1 e:list)
		{
			System.out.println(e.geteId()+" : "+e.geteName()+" : "+e.geteCity());
		}
	
		
	/*	
		System.out.println("///////////////////////////////////////////////////////////////////");
		//Delete Query:----------------------
		Query q2=sess.createQuery("delete from Employee1 where city=:d");            //pass x parameter
		q2.setParameter("d", "Pune");
		int i=q2.executeUpdate();
		System.out.println("Deleted");
		System.out.println(i);
		
		
		//Update Query:----------------------
		 Query q3=sess.createQuery("update Employee1 set city=:t where name=:n ");
		 q3.setParameter("t","Nashik");
		 q3.setParameter("n", "Siddhant");
		 int j=q3.executeUpdate();
		 System.out.println(j);
		 
	*/	
		
		
	/*	
		// Execute Join query:--------------------(import com.map.OO.Question )
		 Query q4=sess.createQuery("select q.question,q.queId,a.answer from Question as q INNER JOIN q.answer as a");
		 
			List<Object []>list4=q4.getResultList();
			for(Object[] arr:list4)
			{
				System.out.println(Arrays.toString(arr));
			}
			
		*/	
		
		tx.commit();
		sess.close();
		factory.close();
	}

}
