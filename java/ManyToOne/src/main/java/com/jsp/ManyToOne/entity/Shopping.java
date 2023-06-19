package com.jsp.ManyToOne.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

import com.jsp.MantToOne.constant.EntityConstant;

@Entity
@Table(name = EntityConstant.SHOPPING_INFO)
public class Shopping {
	@Id
	@GenericGenerator(name="auto",strategy ="increment")
	@GeneratedValue(generator ="auto")
	@Column(name = "id")
	private Long id;
	@Column(name = "name")
	private String name;
	@Column(name = "version")
	private String version;
	@Column(name = "supportedOrType")
	private String supportedOrType;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "foreign_key")
	private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getSupportedOrType() {
		return supportedOrType;
	}

	public void setSupportedOrType(String supportedOrType) {
		this.supportedOrType = supportedOrType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
