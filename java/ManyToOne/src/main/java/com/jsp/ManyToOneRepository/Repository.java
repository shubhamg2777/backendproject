package com.jsp.ManyToOneRepository;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.ManyToOne.entity.Shopping;
import com.jsp.ManyToOne.entity.User;
import com.jsp.ManyToOne.util.PropertiesUtil;

public class Repository {
	public void saveShoppingDetails(Shopping shopping) {
		try {
			Properties properties = PropertiesUtil.getConnectionProperties();
			Configuration cfg = new Configuration();
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Shopping.class);
			cfg.addAnnotatedClass(User.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			// managing the connection
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(shopping);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void saveUserDetails(User user) {
		try {
			Properties properties = PropertiesUtil.getConnectionProperties();
			Configuration cfg = new Configuration();
			cfg.setProperties(properties);
			cfg.addAnnotatedClass(Shopping.class);
			cfg.addAnnotatedClass(User.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(user);
			transaction.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
} 
