package com.objectStates;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DemoObjectStates {

	public static void main(String[] args) {
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		
		//Create Car object
		Car c=new Car();                       //object at Transient State
		c.setCarNo(1221);
		c.setCarName("Alto");
		c.setCarColor("Red");
		
		Session s=f.openSession();
		Transaction tx=s.beginTransaction();
		s.save(c);                           //object at Persistent State
		
		c.setCarName("Benz");                 //object at Detached State
		tx.commit();
		
		
		
		f.close();
	
		
		

	}

}
