package com.springjpa.service;

import com.springjpa.model.Department;

public interface DepartmentService {
	public void save(Department dept) ;
	public Department get(int id);
}
