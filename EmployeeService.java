package com.springjpa.service;

import java.util.List;

import com.springjpa.model.Employee;

public interface EmployeeService {
	public void save(Employee employee);
	public Employee get(int id);
	List<Employee> getAllPermanentEmployees(); 
}

