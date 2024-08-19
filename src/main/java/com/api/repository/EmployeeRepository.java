package com.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entity.Employees;

public interface EmployeeRepository extends JpaRepository<Employees, Integer>{

}
