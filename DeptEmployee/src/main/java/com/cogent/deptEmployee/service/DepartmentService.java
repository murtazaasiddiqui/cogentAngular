package com.cogent.deptEmployee.service;

import java.util.Optional;

import com.cogent.deptEmployee.model.Department;



public interface DepartmentService {

	
	public Optional<Department> addDepartment(Department department) ;
	public void deleteAll();
	public Optional<Department> deleteDepartment(String departmentId) ;
	
	public Optional<Department> updateDepartment(Department departmentId);
}
