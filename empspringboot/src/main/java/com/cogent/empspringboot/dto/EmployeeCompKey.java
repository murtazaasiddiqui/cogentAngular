package com.cogent.empspringboot.dto;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class EmployeeCompKey implements Serializable{

	private String empId;
	
	private String userId;

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	
		
		
		
	

	
	
	
	
	
	
	
	
	
}
