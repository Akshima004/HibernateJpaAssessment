package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Retreive {
	public static void main(String[] args){
		Configuration conf=new Configuration().configure();
		SessionFactory sf=conf.buildSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Employee emp=(Employee)session.load(Employee.class, 101);
		System.out.println(emp);
		Query queryResult = session.createQuery("from Employee");
		  java.util.List allUsers;
		  allUsers = queryResult.list();
		  for (int i = 0; i < allUsers.size(); i++) {
		   Employee empl = (Employee) allUsers.get(i);
		  
		  System.out.println(empl);
		  }
		 System.out.println("Database contents delivered..."); 
}
}
