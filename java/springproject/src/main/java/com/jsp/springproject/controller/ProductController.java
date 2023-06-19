package com.jsp.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@RestController
@EnableWebMvc
public class ProductController {
	
	@Autowired
	private Services service;
	
	@PostMapping(value = "/addProduct")
	public void addProduct(@RequestBody ProductDetails productDetails)
	{
		service.addproduct(productDetails);
	}
	
	@GetMapping(value="/getAllProduct")
	public @ResponseBody List<ProductDetails> getAllProduct() {
		return service.getAllProductDetails();
	}
	
	@GetMapping(value = "/getProductById")
	public @ResponseBody ProductDetails getProductById(long id)
	{
		return service.getProductById(id);
	}

}
