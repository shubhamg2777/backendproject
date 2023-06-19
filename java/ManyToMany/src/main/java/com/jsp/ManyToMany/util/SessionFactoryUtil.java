package com.jsp.ManyToMany.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.ManyToMany.entity.Bus;
import com.jsp.ManyToMany.entity.Passenger;



public class SessionFactoryUtil {
	 private static SessionFactory factory = null; 
	  public static SessionFactory getSessionFactoryObject () { 
	if 	 (factory==null) {
		Properties properties=  PropertiesUtil.getConnectionProperties();
		Configuration cfg = new Configuration();
		cfg.setProperties(properties);
		cfg.addAnnotatedClass(Bus.class);
		cfg.addAnnotatedClass(Passenger.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory();

	return sessionFactory; 
	}
	return factory;
	}
}
