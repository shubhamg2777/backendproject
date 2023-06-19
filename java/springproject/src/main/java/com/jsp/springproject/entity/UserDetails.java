package com.jsp.springproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user_details")
public class UserDetails implements Serializable {

	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")

	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "contactNumber")
	private String contactNumber;

	@Column(name = "password")
	private String password;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "country")
	private String country;

	@Column(name = "pincode")
	private long pincode;

	@Column(name = "createdDate")
	private String createdDate;

	@Column(name = "modifiedDate")
	private String modifiedDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifieddate() {
		return modifiedDate;
	}

	public void setModifieddate(String modifieddate) {
		this.modifiedDate = modifieddate;
	}

	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", name=" + name + ", email=" + email + ", contactNumber=" + contactNumber
				+ ", password=" + password + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", pincode=" + pincode + ", createdDate=" + createdDate + ", modifieddate=" + modifiedDate + "]";
	}

}
