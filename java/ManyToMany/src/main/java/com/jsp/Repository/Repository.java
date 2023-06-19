package com.jsp.Repository;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jsp.ManyToMany.entity.Bus;
import com.jsp.ManyToMany.entity.Passenger;
import com.jsp.ManyToMany.util.PropertiesUtil;

public class Repository {
public void saveBus(Bus bus) {
	Properties properties = PropertiesUtil.getConnectionProperties();
	Configuration cfg = new Configuration();
	cfg.setProperties(properties);
	cfg.addAnnotatedClass(Bus.class);
	cfg.addAnnotatedClass(Passenger.class);
	SessionFactory sessionFactory = cfg.buildSessionFactory(); 
	// managing the connection 
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	session.save(bus);
	transaction.commit();
	session.close();
}
}