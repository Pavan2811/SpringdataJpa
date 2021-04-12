package com.springjpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springjpa.model.Department;
@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
