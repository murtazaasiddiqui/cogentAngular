package com.cogent.deptEmployee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cogent.deptEmployee.model.Employee;

@Repository

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

	@Query("select e from Employee e")
	public List<Employee> getAllData();
	
	
	
}
