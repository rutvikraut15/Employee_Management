package com.nit.layer;

import java.sql.ResultSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nit.entity.Employee;

@Repository
public class EmployeeService {

	@Autowired
	Employee employee;
	
	
	public boolean addEmployee(Employee emp) {
	
		Employee em = new Employee(emp.getEmpID(), emp.getName(), emp.getDepartment(), emp.getSalary());
		
		
		return false;
	}
	
	
	public void showAllEmployee() {
		
		ResultSet rs; 
	}
	
	public Employee showEmployee(int id) {
		
		String SQL_QUERY_FINDER = "SELECT * FROM EMPLOYEE WHERE id=?";
		
		
		return new Employee();
		
	}
}
