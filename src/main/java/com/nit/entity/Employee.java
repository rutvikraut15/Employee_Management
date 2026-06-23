package com.nit.entity;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Employee {

	private int empID;
	private String name;
	private String department;
	private double salary;
	
	
	
	public Employee(int empID, String name, String department, double salary) {
		this.empID = empID;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}



	public Employee() {
		super();
	}
	
	

}
