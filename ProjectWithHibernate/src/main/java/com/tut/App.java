package com.tut;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println("Project Started..");
        
        Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
      
        
        //Create Employee obj
        Employee e=new Employee();
        e.setEid(103);
        e.setName("Siddhant");
        e.setCity("Nashik");
        
        
        Depatment dept=new Depatment();
        dept.setDeptId(101);
        dept.setDeptName("Comp");
        
        
        e.setDept(dept);
        //create object od Address 
        Address ad=new Address();
        ad.setStreet("street1");
        ad.setCity("Ahmednagar");
        ad.setIsopen(true);
        ad.setAddedDate(new Date());
        ad.setX(123.456);
      /*
        //Reading image
        FileInputStream fis=new FileInputStream("src/main/java/Screenshot (330).png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        */
        
        Session session = factory.openSession();
        Transaction tx=session.beginTransaction();
      
        session.save(e);
        
        
        session.save(ad);
        tx.commit();
        session.close();
        
        System.out.println("Done it...");
    }
}
