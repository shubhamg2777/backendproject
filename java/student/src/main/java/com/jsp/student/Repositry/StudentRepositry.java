package com.jsp.student.Repositry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.jsp.student.dto.StudentDto;
import com.jsp.student.entity.StudentInfo;
import com.jsp.student.util.SessionFactoryUtil;

public class StudentRepositry {

	public void saveStudentDetails ( StudentInfo studentInfo) {
		try {
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.save(studentInfo);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public StudentInfo getElementById (int i) {
		try {
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			return session.get(StudentInfo.class, i);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	public void updateStudentDetails ( StudentDto studentDto) {
		StudentInfo studentInfo = getElementById(studentDto.getId());
		if (studentInfo!=null) {
			studentInfo.setEmail(studentDto.getEmail());;
			studentInfo.setHighestQualification(studentDto.getHighestDegree());
			SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactoryObject();
			Session session = sessionFactory.openSession();
			Transaction transaction = session.beginTransaction();
			session.update(studentInfo);
			transaction.commit();
		}
	}
	public void deleleteStudentDetails() {
		
	}
}
