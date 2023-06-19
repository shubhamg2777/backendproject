package com.jsp.ManyToOne.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.jsp.MantToOne.constant.EntityConstant;

@Entity
@Table(name = EntityConstant.USER_INFO)
public class User implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Shopping> shopping;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Shopping> getShopping() {
		return shopping;
	}

	public void setShopping(List<Shopping> shopping) {
		this.shopping = shopping;
	}

}
