package com.arun.HibernateSixth;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Account;
import com.arun.entity.Employee;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	SessionFactory sf=new Configuration().configure().buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        Account acc=new Account();
        
        acc.setAccName("Arun");
        
        acc.setAccNo("A123");
        
        acc.setAccType("Saving");
        
        
        Employee emp=new Employee();
        emp.setAccount(acc);
        emp.setEaddress("Hyderabad");
        emp.setEname("Arun");
        emp.setEsal(1000.0f);
        
        
        session.save(emp);
        
        tx.commit();
        
        session.close();
        
        
        
    }
}
