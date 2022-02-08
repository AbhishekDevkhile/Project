package com.sqlQuery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.map.MM.Emp;

public class DemoSqlQuery {

	public static void main(String[] args)
	{
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		//Sql Query
	
		String q="Select * from Emp";
		NativeQuery  nq=s.createSQLQuery(q);
		List<Object[]>list=nq.list();
		for(Object[] a:list)
		{
			System.out.println(Arrays.toString(a));
	//		System.out.println(a[2]+":"+a[3]);           //only print 2 & 3 Column
		}
		
		
		factory.close();
		s.close();
		

	}

}
