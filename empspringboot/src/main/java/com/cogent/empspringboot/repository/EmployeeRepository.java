package com.cogent.empspringboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cogent.empspringboot.dto.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,String>{

	
	
}
