package com.jsp.springwebsecond.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springwebsecond.dto.LoginDto;
import com.jsp.springwebsecond.dto.RegisterDto;
import com.jsp.springwebsecond.service.RegisterService;

//@Component
@Controller
public class RegisterController {

	@Autowired
	private RegisterService registerService;
	
	@RequestMapping(value = "/saveUserDetails")
	public ModelAndView saveUserDetails(RegisterDto registerDto) {
		System.out.println(registerDto);
		registerService.processUserDetails(registerDto);
		return new ModelAndView("display1.jsp");
	}
	
	@RequestMapping(value = "/loginUserDetails")
	public ModelAndView saveLoginDetails(LoginDto logindto) {
		boolean isValidUser = registerService.processuserLogin(logindto);
		if (isValidUser) {
			return new ModelAndView("display2.jsp");
		}
		return new ModelAndView("indexs.jsp");
	}
}
