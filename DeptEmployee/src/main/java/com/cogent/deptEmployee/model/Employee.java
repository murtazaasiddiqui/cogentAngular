package com.cogent.deptEmployee.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Employee {

	@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name="")
	private Department dpt;
	private String empCode;
	private String empName;
	private Double salary;
	
	
	

	
	
	
	
	
}
