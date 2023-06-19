
package com.jsp.springproject.controller;

import java.util.Base64;
import java.util.Base64.Encoder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.jsp.springproject.dto.LoginDto;
import com.jsp.springproject.entity.UserDetails;
import com.jsp.springproject.service.Services;


@RestController
@EnableWebMvc
public class UserController {
	
	@Autowired
	private Services service;

	@PostMapping(value="/registerUser")
	public void registerUser(@RequestBody UserDetails userDetails)
	{
		Encoder encoder=Base64.getEncoder();
		String orginalPassword=userDetails.getPassword();
		String encodedPassword=encoder.encodeToString(orginalPassword.getBytes());
		userDetails.setPassword(encodedPassword);
		service.saveUserDetails(userDetails);
	}
	
	@GetMapping(value="/loginDetails")
	public @ResponseBody UserDetails loginDetails(LoginDto loginDto)
	{
		Encoder encoder = Base64.getEncoder();
		String orginalPassword=loginDto.getPassword();
		String encodedPassword=encoder.encodeToString(orginalPassword.getBytes());
		loginDto.setPassword(encodedPassword);
		return service.processLoginDetails(loginDto);
	}
}
