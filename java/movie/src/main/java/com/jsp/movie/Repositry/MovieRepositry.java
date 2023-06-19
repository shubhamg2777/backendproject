package com.jsp.movie.Repositry;

import java.util.Properties;

import javax.persistence.EntityTransaction;
import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.jsp.movie.entity.MovieInfo;
import com.jsp.movie.util.PropertiesUtil;

public class MovieRepositry {

public void saveMovieDetails (MovieInfo movieinfo) {
	try {
		Properties properties = PropertiesUtil.getConnectionProperties();
		Configuration cfg = new Configuration();
		// connection properties
		cfg.setProperties(properties);
		// mapping class .class as an input parameter 
		cfg.addAnnotatedClass(MovieInfo.class);
		SessionFactory sessionFactory = cfg.buildSessionFactory(); 
		// managing the connection 
		Session session = sessionFactory.openSession(); 
		org.hibernate.Transaction transaction=session.beginTransaction(); 
		session.save(movieinfo); 
		transaction.commit(); 
	} catch (Exception e) { 
		e.printStackTrace(); 
	} 
}

public void getMovieDetails(MovieInfo movieinfo){

}

public void updateMovieDetails() {

}

public void deleteMovieDetails() {

}

}
