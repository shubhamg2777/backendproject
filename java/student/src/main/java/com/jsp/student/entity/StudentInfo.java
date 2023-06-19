package com.jsp.student.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.student.constant.EntityConstant;

@Entity
@Table(name = EntityConstant.STUDENT_INFO)
public class StudentInfo implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "age")
	private int age;
	@Column(name = "email")
	private String email;
	@Column(name = "yearOfPassout")
	private int yearOfPassout;
	@Column(name = "highestQualification")
	private String highestQualification;
	@Column(name = "joiningDate")
	private String joiningDate;

	public StudentInfo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getYearOfPassout() {
		return yearOfPassout;
	}

	public void setYearOfPassout(int yearOfPassout) {
		this.yearOfPassout = yearOfPassout;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "StudentInfo [id=" + id + ", name=" + name + ", age=" + age + ", email=" + email + ", yearOfPassout="
				+ yearOfPassout + ", highestQualification=" + highestQualification + ", joiningDate=" + joiningDate
				+ "]";
	}

}