
package com.jsp.springproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.jsp.springproject.dto.OrderDto;
import com.jsp.springproject.entity.OrderDetails;
import com.jsp.springproject.service.Services;

@RestController
@EnableWebMvc
public class OrderController {

	@Autowired
	private Services service;

	@PostMapping(value = "/addOrder")
	public void addOrder(@RequestBody OrderDto oredrDto) {
		service.order(oredrDto);
	}

	@GetMapping(value = "/getAllOrder")
	public List<OrderDetails> getAllOrder() {
		return service.getAllOrderDetails();
	}

}
