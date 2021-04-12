package com.springjpa.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.dao.EmployeeRepository;
import com.springjpa.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;

	@Transactional 
	  public Employee get(int id) { 
	  return empRepo.findById(id).get();
			  
	
	}
	@Transactional 
	public void save(Employee employee) { 
		empRepo.save(employee);
	}
	@Transactional
	@Override
	public List<Employee> getAllPermanentEmployees() {
	    List<Employee> empList=empRepo.getAllPermanentEmployees();
		return empList;
	}


}
