package com.jsp.OneToOne.Repositry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.OneToOne.entity.Person;
import com.jsp.OneToOne.util.SessionFactoryUtil;

public class AssociateRepository {
	public void savePersonDetails(Person person) {
		try {

			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(person);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}