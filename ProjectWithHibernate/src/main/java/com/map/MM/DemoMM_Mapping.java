
package com.map.MM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoMM_Mapping {

	public static void main(String[] args) {
		
		System.out.println("Started............");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory  factory=cfg.buildSessionFactory();
		
		Emp e1=new Emp();
		e1.seteId(01);
		e1.seteName("Abhishek");
		
		Emp e2=new Emp();
		e2.seteId(02);
		e2.seteName("Siddhant");
		
		Emp e3=new Emp();
		e3.seteId(03);
		e3.seteName("Chaitanya");
		
		
		
		Project p1=new Project();
		p1.setpId(111);
		p1.setpNmae("LMS");
		
		Project p2=new Project();
		p2.setpId(112);
		p2.setpNmae("SMS");
		
		Project p3=new Project();
		p3.setpId(113);
		p3.setpNmae("HMS");
		
		
		List<Emp>elist=new ArrayList<Emp>();
		elist.add(e1);
		elist.add(e2);
		elist.add(e3);
		
		
		List<Project>plist=new ArrayList<Project>();
		plist.add(p1);
		plist.add(p2);
		plist.add(p3);
		
		//one employee assign three project
		e1.setProjects(plist);
		//e2.setProjects(plist);
	//	e3.setProjects(plist);
		
		
		//one project assign three Employee
		p1.setEmployees(elist);
		//p2.setEmployees(elist);
		//p3.setEmployees(elist);
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(e1);
		s.save(e2);
		s.save(e3);
		
		
		s.save(p1);
		s.save(p2);
		s.save(p3);
		
	//	s.save(elist);
	//	s.save(plist);
		
		
		
		s.close();
		factory.close();
		System.out.println("Done it......	");

	}

}
