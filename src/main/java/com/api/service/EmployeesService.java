package com.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.entity.Employees;
import com.api.repository.EmployeeRepository;

@Service
public class EmployeesService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employees addEmployees(Employees employees) {
		return employeeRepository.save(employees);
		
	}
	
	public List<Employees> getEmployees(Employees employees){
		return employeeRepository.findAll();
	}
	

}
