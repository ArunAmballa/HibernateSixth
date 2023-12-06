package com.arun.HibernateSixth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Employee;

public class Retrieval {

	public static void main(String[] args) 
	
	{
		
        SessionFactory sf=new Configuration().configure().buildSessionFactory();
        
        Session session=sf.openSession();
        
        Employee emp=session.get(Employee.class, 1);
        
        System.out.println(emp);
        
        session.close();
        
     

	}

}
