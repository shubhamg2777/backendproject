package com.jsp.springproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "product_detalils")
public class ProductDetails implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	private String name;

	@Column(name = "price")
	private long price;

	@Column(name = "description")
	private String description;

	@Column(name = "type")
	private String type;

	@Column(name = "totalAvailableQuantity")
	private long totalAvailableQuantity;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "modifiedBy")
	private String modifiedBy;

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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getTotalAvailableQuantity() {
		return totalAvailableQuantity;
	}

	public void setTotalAvailableQuantity(long totalAvailableQuantity) {
		this.totalAvailableQuantity = totalAvailableQuantity;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	@Override
	public String toString() {
		return "ProductDetails [id=" + id + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", type=" + type + ", totalAvailableQuantity=" + totalAvailableQuantity + ", createdBy=" + createdBy
				+ ", modifiedBy=" + modifiedBy + ", createdDate=" + createdDate + ", modifiedDate=" + modifiedDate
				+ "]";
	}

}
