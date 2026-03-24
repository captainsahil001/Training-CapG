package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@SuppressWarnings("serial")
@AllArgsConstructor
public class EmployeeNotFound extends RuntimeException{
	
	@Getter
	private String exceptionMobMsg;
}
