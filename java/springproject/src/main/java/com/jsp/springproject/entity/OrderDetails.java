package com.jsp.springproject.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "order_details")
public class OrderDetails implements Serializable {
	@Id
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")

	@Column(name = "id")
	private long id;

	@Column(name = "productId")
	private long productId;

	@Column(name = "userId")
	private long userId;

	@Column(name = "quantity")
	private long quantity;

	@Column(name = "totalPrice")
	private long totalPrice;

	@Column(name = "paymentMode")
	private String paymentMode;

	@Column(name = "status")
	private String status;

	@Column(name = "createdBy")
	private String createdBy;

	@Column(name = "createdDate")
	private String createdDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public long getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(long totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}

	@Override
	public String toString() {
		return "OrderDetails [id=" + id + ", productId=" + productId + ", userId=" + userId + ", quantity=" + quantity
				+ ", totalPrice=" + totalPrice + ", paymentMode=" + paymentMode + ", status=" + status + ", createdBy="
				+ createdBy + ", createdDate=" + createdDate + "]";
	}

}
