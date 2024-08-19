package com.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Employees;
import com.api.service.EmployeesService;

@RestController()
@RequestMapping("/api")
public class EmployeesController {

	@Autowired
	private EmployeesService employeesService;

	@PostMapping("/postapi")
	public Employees addEmp(@RequestBody Employees employees) {
		return employeesService.addEmployees(employees);
	}
	
	@GetMapping("/getemp")
	public List<Employees> getEmp(Employees employees) {
		
		return employeesService.getEmployees(employees);
	}

}
