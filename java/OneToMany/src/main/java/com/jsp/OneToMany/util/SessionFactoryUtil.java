package com.jsp.OneToMany.util;

import java.util.Properties;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.jsp.OneToMany.entity.Application;
import com.jsp.OneToMany.entity.Mobile;

public class SessionFactoryUtil {

	private static SessionFactory factory = null;

	public static SessionFactory getSessionFactoryObject() {
		if (factory == null) {
			Properties properties = PropertiesUtil.getConnectionProperties();
			Configuration cfg = new Configuration();
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Mobile.class);
			cfg.addAnnotatedClass(Application.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();

			return sessionFactory;
		}
		return factory;
	}

}
