package com.map.OM;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map.OO.Answer;
import com.map.OO.Question;

public class DemoMap1 {

	public static void main(String[] args) {
		System.out.println("Project Start...");
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
	
		
		//Create object of Question class
		Question1 que=new Question1();
		que.setQueId(111);
		que.setQuestion("Animal");
		
		//Create object of Answer class
				Answer1 an=new Answer1();
				an.setAnsId(001);
				an.setAnswer("Tiger");
		
				

         //Create Another Answer
				Answer1 an1=new Answer1();
				an1.setAnsId(002);
				an1.setAnswer("Elephant");
				
		//Create Another Answer
				Answer1 an2=new Answer1();
				an2.setAnsId(003);
				an2.setAnswer("Dog");
		 
				
		List<Answer1> l=new ArrayList<Answer1>();	
		l.add(an);
		l.add(an1);
		l.add(an2);
		
		que.setAnswer(l);
		
		
		
		
		//Session
		
		Session s=factory.openSession();
		Transaction tx=s.beginTransaction();
		
		s.save(an);
		s.save(an1);
		s.save(an2);
		s.save(que);
		
		tx.commit();
		
		
		//Display Question and its Answers
		
			Question1 q=(Question1)s.get(Question1.class,111);
			System.out.println(q.getQuestion());                                               //get Question
			
			for(Answer1 a:q.getAnswer())                                                        //Gete Answer using forEach loop
			{
				System.out.println(a);
			}
			
				
		
		
		
		
		s.close();
		factory.close();

	}

}
