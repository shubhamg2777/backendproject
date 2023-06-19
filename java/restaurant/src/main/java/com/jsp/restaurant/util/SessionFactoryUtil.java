package com.jsp.restaurant.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.restaurant.entity.RestaurantInfo;


public class SessionFactoryUtil { 
 private static SessionFactory factory = null; 
  public static SessionFactory getSessionFactoryObject () { 
if 	 (factory==null) {
	Properties properties=  PropertiesUtil.getConnectionProperties();
	Configuration cfg = new Configuration();
	cfg.setProperties(properties);
	cfg.addAnnotatedClass(RestaurantInfo.class);
	SessionFactory sessionFactory = cfg.buildSessionFactory();

return sessionFactory;
}
return factory;
}
 
}
