package com.cogent.deptEmployee.service;

import java.util.List;
import java.util.Optional;

import com.cogent.deptEmployee.model.Department;
import com.cogent.deptEmployee.model.Employee;

public interface EmployeeService {

	

	public Optional<Employee> addEmployee(Employee employee) ;
	
	public Optional<Employee> deleteEmployee(String employeeId) ;
	
	public Optional<Employee> updateEmployee(String id);
	public List<Employee> getEmployeeById(String empCode);
	public List<Employee> getEmpList();
}
