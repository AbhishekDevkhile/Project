package com.tut;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DemoEmbedding {

	public static void main(String[] args) {
		 Configuration cfg=new Configuration();
		 cfg.configure();
		 SessionFactory factory=cfg.buildSessionFactory();
		 
		 
		 Depatment dept=new Depatment();
		 dept.setDeptId(2112);
		 dept.setDeptName("IT");
		 
		 Depatment dept1=new Depatment();
		 dept1.setDeptId(1221);
		 dept1.setDeptName("Java");
		 
		 Employee emp1=new Employee();
		 emp1.setEid(123);
		 emp1.setName("Yuvraj");
		 emp1.setCity("Newasa");
		 emp1.setDept(dept);
		 
		 Employee emp2=new Employee();
		 emp2.setEid(456);
		 emp2.setName("Gayatri");
		 emp2.setCity("Pune");
		 emp2.setDept(dept1);
		 
		 
		 Session s=factory.openSession();
		 Transaction tx=s.beginTransaction();
		 
		 //object save
		 s.save(emp1);
		 s.save(emp2);
		 
		 
		 
		 
		 tx.commit();
		 s.close();
		 factory.close();

	}

}
