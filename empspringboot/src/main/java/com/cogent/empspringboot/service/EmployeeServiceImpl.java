package com.cogent.empspringboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cogent.empspringboot.dto.Employee;
import com.cogent.empspringboot.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	
	private EmployeeRepository employeeRepository;

	@Override
	public Optional<Employee> addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		Employee employee2 =employeeRepository.save(employee);
	
		return Optional.ofNullable(employee2);
	}

	@Override
	public Optional<Object> deleteEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Employee> getEmployeeById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployee(String id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmployeeExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Optional<Employee> getEmployeeById() {
		// TODO Auto-generated method stub
		return null;
	}
}
