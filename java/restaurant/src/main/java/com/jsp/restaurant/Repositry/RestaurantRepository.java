package com.jsp.restaurant.Repositry;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.jsp.restaurant.dto.RestaurantDto;
import com.jsp.restaurant.entity.RestaurantInfo;
import com.jsp.restaurant.util.PropertiesUtil;
import com.jsp.restaurant.util.SessionFactoryUtil;

public class RestaurantRepository {

//  dao :-here we will write only perform the opertaion of data base logic . 

	public void saveRestaurantDetails(RestaurantInfo restaurantInfo) {
		try {

			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(restaurantInfo);
			transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace(); 
		}

	}

	public RestaurantInfo getRestaurantById(Long i) {
		try {
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			return session.get(RestaurantInfo.class, i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateRestaurantDetails(RestaurantDto restaurantDto) {
		RestaurantInfo r = getRestaurantById(restaurantDto.getId());
		if (r != null) {
			r.setAddress(restaurantDto.getAddress());
			r.setRating(restaurantDto.getRating());
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(r);
			transaction.commit();

		}
	}

	public void deleteRestaurantDetails(Long id) {
		RestaurantInfo restaurantInfo = getRestaurantById(id);
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.delete(restaurantInfo);
		transaction.commit();
	}
}