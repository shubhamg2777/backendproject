package com.jsp.springemployee.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springemployee.entity.EmployeeEntity;
import com.jsp.springemployee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Autowired
	private ModelMapper mapper;

	public List<EmployeeEntity> getEmployees() {
		return employeeRepository.findAll();
	}

	public void SaveEmployees(EmployeeEntity entity) {
	EmployeeEntity employeeEntity = mapper.map(entity, EmployeeEntity.class);
		employeeRepository.save(entity);
	}
}