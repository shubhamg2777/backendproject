package com.jsp.OneToOne.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.OneToOne.entity.AdharDetails;
import com.jsp.OneToOne.entity.Person;


public class SessionFactoryUtil {
	 private static SessionFactory factory = null;
	  public static SessionFactory getSessionFactoryObject () { 
	if 	 (factory==null) {
		Properties properties=  PropertiesUtil.getConnectionProperties();
		Configuration cfg = new Configuration();
		cfg.setProperties(properties);
		cfg.addAnnotatedClass(Person.class);
		cfg.addAnnotatedClass(AdharDetails.class);	
		SessionFactory sessionFactory = cfg.buildSessionFactory();

	return sessionFactory;
	}
	return factory;
	}  
}
