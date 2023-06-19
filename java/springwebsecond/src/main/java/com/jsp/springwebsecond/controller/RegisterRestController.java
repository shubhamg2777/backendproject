package com.jsp.springwebsecond.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springwebsecond.dto.RegisterDto;
import com.jsp.springwebsecond.entity.RegisterEntity;
import com.jsp.springwebsecond.service.RegisterService;

//@Controller
//@ResponseBody for convert java to  json
// combination of  @Controller @ResponseBody

@RestController
public class RegisterRestController {
	@Autowired
	private RegisterService registerService;

	// @RequestMapping(value = "/getAllRegisterDetails" , method = HttpMethod.GET)
	@GetMapping(value ="/getAllRegisterDetails")
	public @ResponseBody List<RegisterEntity> getUserDetails() {
		List<RegisterEntity> registerDetails = registerService.getAllRegisterDetails();
		return registerDetails;
	}

	// json to javaobject @RequestBody
	// @RequestMapping(value = "/saveUser")
	@PostMapping(value = "/saveUser")
	public void saveUserDetails(@RequestBody RegisterDto dto) {
		registerService.processUserDetails(dto);

	}

	// @GetMapping(value="/getById/{id}/{name}") @PathVariable("name"))
	@GetMapping(value="/getsById/{id}")
public @ResponseBody RegisterEntity getsById(@PathVariable ("id") int id) {
	return registerService.findById(id);
}
}