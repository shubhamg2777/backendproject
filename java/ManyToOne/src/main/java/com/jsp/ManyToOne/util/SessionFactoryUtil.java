package com.jsp.ManyToOne.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.ManyToOne.entity.Shopping;
import com.jsp.ManyToOne.entity.User;

public class SessionFactoryUtil {

	private static SessionFactory factory = null;

	public static SessionFactory getSessionFactoryObject() {
		if (factory == null) {
			Properties properties = PropertiesUtil.getConnectionProperties();
			Configuration cfg = new Configuration();
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Shopping.class);
			cfg.addAnnotatedClass(User.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();

			return sessionFactory;
		}
		return factory;
	}
}
