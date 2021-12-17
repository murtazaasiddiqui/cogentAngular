package com.cogent.empspringboot;

import java.util.Date;
import java.util.Optional;
import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.empspringboot.dto.Employee;
import com.cogent.empspringboot.service.EmployeeService;


@SpringBootApplication
public class EmpspringbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpspringbootApplication.class, args);
		
		
		ApplicationContext applicationContext = SpringApplication
				.run(EmpspringbootApplication.class, args);
		
		DataSource dataSource = applicationContext.getBean(DataSource.class);
		
		System.out.println(dataSource!=null);
		
		EmployeeService employeeService = applicationContext.getBean(EmployeeService.class);
		Employee employe = new Employee("ab001","abhi","chi", new Date(), new Date(), 1000.0f);
		
		Optional<Employee> optional = employeeService.addEmployee(employe);
		
		if(optional.isPresent()) {
			
			System.out.println("employee is not added succesfully");
		}
		else {
			System.out.println(optional.get()); 
		}
		
		
	}

	

	
	
	
	
}


