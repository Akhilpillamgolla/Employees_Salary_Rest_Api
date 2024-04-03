package com.EmployeePackage.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
class EmployeeNotFoundException extends RuntimeException {   
	public EmployeeNotFoundException(String message) {  
		super(message); //calls super class 
	}
}