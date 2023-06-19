 
package com.jsp.springemployee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springemployee.entity.EmployeeEntity;
import com.jsp.springemployee.service.EmployeeService;

@CrossOrigin("*")
@RestController
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "/getEmployees")
	public @ResponseBody List<EmployeeEntity> getEmployees() {
		return employeeService.getEmployees();
	}

	@PostMapping(value = "/saveEmployee")
	public void saveEmployee(@RequestBody EmployeeEntity rentity) {
		employeeService.SaveEmployees(rentity);

	}
	
//	@DeleteMapping(value="/deleteEmployee")
//	public void deleteEmployee () {
//		employeeService.
//		
//	}
}
