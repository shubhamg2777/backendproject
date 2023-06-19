package com.jsp.springemployee.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "employee_info")
public class EmployeeEntity implements Serializable {
	@Id
	@Column(name = "empIdNumber")
	private int empIdNumber;
	@Column(name = "fullName")
	private String fullName;
	@Column(name = "gender")
	private String gender;
	@Column(name = "emailId")
	private String emailId;
	@Column(name = "bond")
	private String bond;
	@Column(name = "role")
	private String role;
	@Column(name = "empStartDate")
	private String empStartDate;
	@Column(name = "status")
	private String status;
	
	
	public int getEmpIdNumber() {
		return empIdNumber;
	}
	public void setEmpIdNumber(int empIdNumber) {
		this.empIdNumber = empIdNumber;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getBond() {
		return bond;
	}
	public void setBond(String bond) {
		this.bond = bond;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmpStartDate() {
		return empStartDate;
	}
	public void setEmpStartDate(String empStartDate) {
		this.empStartDate = empStartDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empIdNumber=" + empIdNumber + ", fullName=" + fullName + ", gender=" + gender
				+ ", emailId=" + emailId + ", bond=" + bond + ", role=" + role + ", empStartDate=" + empStartDate
				+ ", status=" + status + "]";
	}
	



}
