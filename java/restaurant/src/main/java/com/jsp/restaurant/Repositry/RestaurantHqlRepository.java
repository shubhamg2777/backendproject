 package com.jsp.restaurant.Repositry;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.jsp.restaurant.dto.RestaurantDto;
import com.jsp.restaurant.entity.RestaurantInfo;
import com.jsp.restaurant.util.SessionFactoryUtil;

public class RestaurantHqlRepository {
	public List<RestaurantInfo> findAll() {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("from RestaurantInfo");
		org.hibernate.query.Query query = session.createQuery(stringBuilder.toString());
		return query.getResultList();
	}

//	public void findByRestaurantName(String restaurantName) {
//		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
//		Session session = sessionFactory.openSession();
//		String query = "from RestaurantInfo where name=" + restaurantName;
//		// org.hibernate.query.Query createQuery = session.createQuery(query);
//		// createQuery.setParameter("BURGER king", restaurantName);
//		// return (RestaurantInfo) createQuery.uniqueResult();
//		StringBuilder stringBuilder1 = new StringBuilder();
//		stringBuilder1.append("from RestaurantInfo where name =BURGER king ");
//	}

	public void updateRestaurantById(RestaurantDto restaurantDto) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		StringBuilder builder = new StringBuilder();
		builder.append("update RestaurantInfo set address=:a ,pincode=:p where id=:i");
		Query createQuery = session.createQuery(builder.toString());
		createQuery.setParameter("a", restaurantDto.getAddress());
		createQuery.setParameter("p", restaurantDto.getPincode());
		createQuery.setParameter("i", restaurantDto.getId());
		Transaction transaction = session.beginTransaction();
		int executeUpdate = createQuery.executeUpdate();
		transaction.commit();

	}

	public void deleteResturantById(Long id) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		StringBuilder builder1 = new StringBuilder();
		builder1.append("delete from RestaurantInfo where id=:is");
		Query createQuery = session.createQuery(builder1.toString());
		createQuery.setParameter("is", id);
		Transaction transaction = session.beginTransaction();
		int deleteRows = createQuery.executeUpdate();
		transaction.commit();
	}
	public void deleteResturantByName(String restaurantName) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
		Session session = sessionFactory.openSession();
		StringBuilder builder1 = new StringBuilder();
		builder1.append("delete from RestaurantInfo where name=:n");
		Query createQuery = session.createQuery(builder1.toString());
		createQuery.setParameter("n", restaurantName);
		Transaction transaction = session.beginTransaction();
		int deleteRows = createQuery.executeUpdate();
		transaction.commit();
	}
}