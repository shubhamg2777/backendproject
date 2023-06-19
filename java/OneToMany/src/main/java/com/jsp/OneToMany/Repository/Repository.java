package com.jsp.OneToMany.Repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.jsp.OneToMany.entity.Mobile;
import com.jsp.OneToMany.util.SessionFactoryUtil;

public class Repository {
	public void saveMobileDetails(Mobile mobile) {
		try {

			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(mobile);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
