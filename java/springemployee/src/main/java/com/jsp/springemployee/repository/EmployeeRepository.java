package com.jsp.springemployee.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springemployee.entity.EmployeeEntity;

@Repository
public class EmployeeRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(EmployeeEntity entity) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(entity);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<EmployeeEntity> findAll() {
		StringBuilder builder1 = new StringBuilder();
		builder1.append(" from EmployeeEntity ");
		Session session = sessionFactory.openSession();
		Query createQuery = session.createQuery(builder1.toString());
		return createQuery.getResultList();

	}
	
	
	
}
