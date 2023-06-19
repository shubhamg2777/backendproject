package com.jsp.springproject.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.springproject.dto.LoginDto;
import com.jsp.springproject.dto.OrderDto;
import com.jsp.springproject.entity.OrderDetails;
import com.jsp.springproject.entity.ProductDetails;
import com.jsp.springproject.entity.UserDetails;
import com.jsp.springproject.repository.Repository;

public class Services {
	
	
	@Autowired
	private Repository repository;
	
	
	public UserDetails processLoginDetails(LoginDto loginDto) {
		
		UserDetails byEmail = repository.findByEmail(loginDto.getEmail());
		if(byEmail.getPassword().equalsIgnoreCase(loginDto.getPassword()))
		{
			return repository.findByEmail(loginDto.getEmail());
		}
		return null;
		
	}
	
	public List<ProductDetails> getAllProductDetails() {
		 return repository.findAllProduct();
	}
	
	public ProductDetails getProductById(long id)
	{
		 return repository.getProductById(id);
	}

	public void saveUserDetails(UserDetails userDetails)
	{
		repository.saveUserDetails(userDetails);
	}
	
	public void addproduct(ProductDetails productDetails)
	{
		repository.saveProductDetails(productDetails);
	}
	
	public void order(OrderDto orderDto)
	{
		OrderDetails details = new OrderDetails();
		ProductDetails productById = getProductById(orderDto.getProductId());
		details.setProductId(orderDto.getProductId());
		details.setUserId(orderDto.getUserId());
		details.setPaymentMode(orderDto.getPaymentMode());
	    details.setQuantity(orderDto.getQuantity());
	  Long totalavailablequantity= productById.getTotalAvailableQuantity()-orderDto.getQuantity();
	  productById.setTotalAvailableQuantity(totalavailablequantity);
	  details.setCreatedBy(productById.getCreatedBy());
	  details.setCreatedDate(productById.getCreatedDate());
	 Long totalprice= productById.getPrice()*orderDto.getQuantity();
	details.setTotalPrice(totalprice);
	details.setStatus("oredred");
	repository.saveOrderDetails(details);
	
	 
		
	}

	public List<OrderDetails> getAllOrderDetails()
	{
		return repository.findAllOrder();
	}
}
