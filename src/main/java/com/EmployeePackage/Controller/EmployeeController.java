package com.EmployeePackage.Controller;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.EmployeePackage.Model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	private List<Employee> employees;

	public EmployeeController() {
		employees = new ArrayList<>();
		employees.add(new Employee(1, " Roy Kuntal ", 35000));
		employees.add(new Employee(2, " Pillamgolla Akhil ", 30000));
		employees.add(new Employee(3, " Prasanth ", 25000));
		employees.add(new Employee(4, " Sahil ", 20000));
	}

	@GetMapping("/office")
	public List<Employee> gethighPayEmployees(@RequestParam("salary") int salary) throws Exception {

		List<Employee> highPayEmployees = employees.stream().filter(emp -> emp.getSalary() >= salary)
				.collect(Collectors.toList());

		if (highPayEmployees.isEmpty()) {
            throw new EmployeeNotFoundException("No employee found with a salary greater than " + salary);
        }
		
		
		return highPayEmployees;
		
	

    }
}
	
	
	

