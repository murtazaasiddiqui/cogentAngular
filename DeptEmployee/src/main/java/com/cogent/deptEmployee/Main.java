package com.cogent.deptEmployee;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.deptEmployee.model.Department;
import com.cogent.deptEmployee.model.Employee;
import com.cogent.deptEmployee.service.DepartmentService;
import com.cogent.deptEmployee.service.EmployeeService;


@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		
		ApplicationContext applicationContext = SpringApplication
				.run(Main.class, args);
		
		
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		
		Employee employee = new Employee();
		Department department;

		
		department = new Department();
		
		department.setDeptCode("d01");
		department.setDeptName("deptname");
		
		
		
		
		
	}

}
