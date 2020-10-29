package com.revature.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory
{
	private static final String USERNAME = GetAuth.property.getProperty("user");
	private static final String PASSWORD = GetAuth.property.getProperty("password");
	private static final String URL = GetAuth.property.getProperty("url");

    private static SessionFactory sessionFactory;
	
    public static Session getSession() 
    {	
	if(sessionFactory == null) 
	{
		sessionFactory = new Configuration().configure()
			.setProperty("hibernate.connection.url", URL) 
			.setProperty("hibernate.connection.username", USERNAME)
			.setProperty("hibernate.connection.password", PASSWORD)
			.buildSessionFactory();
	}
		
	return sessionFactory.getCurrentSession();
    }
}
