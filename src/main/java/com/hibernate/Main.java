package com.hibernate;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Configuration conf=new Configuration();
		 conf.configure();
		 SessionFactory sessionFactory=conf.buildSessionFactory();
		 Session session=sessionFactory.openSession();
	        Employee newEmp = new Employee();
	        newEmp.setEmail("Alok@gmail.com");
	        newEmp.setFname("alok");
	        newEmp.setId(111);
	        session.save(newEmp);
	         
	        Transaction tx=session.beginTransaction();
	        tx.commit();
	        session.close();
	}

}

