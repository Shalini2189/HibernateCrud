package com.hibernate.work.utility;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class HibernateUtil
{
	
	private static SessionFactory sessionfactory;
    static 
    {
    	sessionfactory = new Configuration().configure().buildSessionFactory();//responsible for connection string jpa-database
    }
    public static SessionFactory Connection()
    {
    	return sessionfactory;
    }
}
