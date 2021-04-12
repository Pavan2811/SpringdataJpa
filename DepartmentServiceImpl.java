package com.springjpa.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springjpa.dao.DepartmentRepository;
import com.springjpa.model.Department;
import com.springjpa.model.Employee;
@Service
public class DepartmentServiceImpl implements DepartmentService{
	  @Autowired
	    private DepartmentRepository deptRepo;
		@Transactional 
		public void save(Department dept) { 
			deptRepo.save(dept);
		}
		@Transactional 
		  public Department get(int id) { 
		  return deptRepo.findById(id).get();
				  
		
		}
}
