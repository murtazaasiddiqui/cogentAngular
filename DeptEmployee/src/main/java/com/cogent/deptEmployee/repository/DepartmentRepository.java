package com.cogent.deptEmployee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.deptEmployee.model.Department;

@Repository

public interface DepartmentRepository extends JpaRepository<Department, Integer>{

	
	
}
