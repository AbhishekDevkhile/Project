package com.map.OO;

import org.hibernate.Session; 
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
 
public class DemoMap {

	public static void main(String[] args) {
		
		System.out.println("Project Start...");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		
		//Create object of Answer class
		Answer an=new Answer();
		an.setAnsId(001);
		an.setAnswer("Tiger");
		
		//Create object of Question class
		Question que=new Question();
		que.setQueId(111);
		que.setQuestion("Animal");
		que.setAnswer(an);
		
		//Create object of Answer class
				Answer an1=new Answer();
				an1.setAnsId(002);
				an1.setAnswer("Owls");
				
				//Create object of Question class
				Question que1=new Question();
				que1.setQueId(112);
				que1.setQuestion("Birds");
				que1.setAnswer(an1);
		
		//Session
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		s.save(que);
		s.save(an);
		
		s.save(que1);
		s.save(an1);
		
		tx.commit();
		
	/*	
		//Fetching question and answer ................
		
		
		Question newque=s.get(Question.class, 111);
		System.out.println(newque.getQuestion());
		System.out.println(newque.getAnswer().getAnswer());
		
	*/
		
		s.close();
		factory.close();

	}

}
