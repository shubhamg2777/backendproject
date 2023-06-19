package com.jsp.springwebsecond.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springwebsecond.entity.RegisterEntity;

@Repository
public class RegisterRepository {
	@Autowired
	private SessionFactory sessionFactory;

	public void save(RegisterEntity register) {
		try {
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(register);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public RegisterEntity getLoginByEmail(String email) {
		StringBuilder builder1 = new StringBuilder();
		builder1.append(" from RegisterEntity where email =:e ");
		Session session = sessionFactory.openSession();
		session.createQuery("e");
		Query createQuery = session.createQuery(builder1.toString());
		return (RegisterEntity) createQuery.uniqueResult();
	}

	public List<RegisterEntity> findAll() {
		StringBuilder builder1 = new StringBuilder();
		builder1.append(" from RegisterEntity ");
		Session session = sessionFactory.openSession();
		Query createQuery = session.createQuery(builder1.toString());
		return createQuery.getResultList();

	}

	public RegisterEntity getById(int id) {

		Session session = sessionFactory.openSession();
		return session.get(RegisterEntity.class, id);
	}
}