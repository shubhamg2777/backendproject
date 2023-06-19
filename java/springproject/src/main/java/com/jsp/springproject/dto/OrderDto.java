package com.jsp.springproject.dto;

public class OrderDto {
	
	private long productId;
	
	private long userId;
	
	private long quantity;
	
	private String paymentMode;

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

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	@Override
	public String toString() {
		return "OrderDto [productId=" + productId + ", userId=" + userId + ", quantity=" + quantity + ", paymentMode="
				+ paymentMode + "]";
	}
	
	
	

}
