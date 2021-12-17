package com.cogent.empspringboot.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity //it means that this class is used for ORM purpose
@Table(name="emplTable")//by default it will take entity name as table name so it is employee

public class Employee{

private String empId;
private String empFirstName;
private String empLastName;
private Date doj;
private Date dob;
private float empSalary;

public Employee(String empId, String empFirstName, String empLastName, Date doj, Date dob, float empSalary) {

	super();
	this.empId = empId;
	this.empFirstName = empFirstName;
	this.empLastName = empLastName;
	this.doj = doj;
	this.dob = dob;
	this.empSalary = empSalary;
}
	
	
}