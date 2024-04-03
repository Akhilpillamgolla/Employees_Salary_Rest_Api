package com.EmployeePackage.Model;

import lombok.Data;

@Data
public class Employee {
	private int employeeId;
	private String employeeName;
	private int salary;

	public Employee(int employeeId, String employeeName, int salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
}