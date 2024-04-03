package com.EmployeePackage.Controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
class GlobalExceptionHandler {
	@ExceptionHandler(EmployeeNotFoundException.class)   //invoke exception 
	public String handleEmployeeNotFoundException(EmployeeNotFoundException ex) {
		return ex.getMessage();   //return exception associated with message
	}
}