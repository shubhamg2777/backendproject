package com.jsp.springemployee.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;

public class EmployeeDto implements Serializable {

	private int empIdNumber;
	private String fullName;
	private String gender;
	private String emailId;
	private String bond;
	private String role;
	private Date empStartDate;
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
	public Date getEmpStartDate() {
		return empStartDate;
	}
	public void setEmpStartDate(Date empStartDate) {
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
		return "EmployeeDto [empIdNumber=" + empIdNumber + ", fullName=" + fullName + ", gender=" + gender
				+ ", emailId=" + emailId + ", bond=" + bond + ", role=" + role + ", empStartDate=" + empStartDate
				+ ", status=" + status + "]";
	}
	
}
