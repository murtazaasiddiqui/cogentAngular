package com.cogent.deptEmployee.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity


public class Department {

	
	
	private String deptCode;
	private String deptName;
	private String city;
	
	@OneToMany
	@JoinColumn(name="deptNameCode")
	private List<Employee> empList;

	public void setDeptName(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setDeptCode(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
}
