package com.jsp.springproject.repository;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.springproject.entity.OrderDetails;
import com.jsp.springproject.entity.ProductDetails;
import com.jsp.springproject.entity.UserDetails;


public class Repository {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void  saveProductDetails(ProductDetails productDetails)
	{
		try
		{
			Session Session = sessionFactory.openSession();
			Transaction Transaction = Session.beginTransaction();
		    Session.save(productDetails);
		    Transaction.commit();
			
		}
		catch (Exception e) {
			
		}
	}
	
	public void saveUserDetails(UserDetails userDetails)
	{
		
		try {
			
			Session Session = sessionFactory.openSession();
			Transaction transaction = Session.beginTransaction();
			Session.save(userDetails);
			transaction.commit();
			
		} catch (Exception e) {
			
			
		}
		
		
	
	}
	
	public void saveOrderDetails(OrderDetails orderdetails)
	{
try {
			
			Session Session = sessionFactory.openSession();
			Transaction transaction = Session.beginTransaction();
			Session.save(orderdetails);
			transaction.commit();
			
		} catch (Exception e) {
			
			
		}
	}

	
	public UserDetails findByEmail(String Email)
	{
		StringBuilder builder = new StringBuilder();
		builder.append("from UserDetails where email=:e");
		
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(builder.toString());
		return (UserDetails) query.uniqueResult();
	}
	
	public List<ProductDetails> findAllProduct()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("from ProductDetails");
		
		Session session = sessionFactory.openSession();
	   Query query = session.createQuery(builder.toString());
	   return query.getResultList();
		
	}
	
	public ProductDetails getProductById(long id) {
		Session session = sessionFactory.openSession();
		return session.get(ProductDetails.class, id);
		
	}
	
	public List<OrderDetails> findAllOrder()
	{
		StringBuilder builder = new StringBuilder();
		builder.append("from OrderDetails");
		
		Session session = sessionFactory.openSession();
	   Query query = session.createQuery(builder.toString());
	   return query.getResultList();
		
	}

}

