package com.employee.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class EmployeeExceptionHandler {
	
	@ExceptionHandler(DuplicateEmailException.class)
	public ResponseEntity<?> duplicateEmailExceptionHandler(DuplicateEmailException ex) {
//		String exceptionMsg=ex.getExcpemailid_mssge();   //variable er je nam setar getter asbe
//		System.out.println(exceptionMsg);
		return new ResponseEntity<>(ex.getExcpemailid_mssge(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(DuplicateMobileNumberException.class)
	public ResponseEntity<?> duplicatemobileNumberExceptionHandler(DuplicateMobileNumberException ex) {
//		String exceptionMsg=ex.getExcpmobnum_mssge();
//		System.out.println(exceptionMsg);
		return new ResponseEntity<>(ex.getExcpmobnum_mssge(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(InvalidCredentials.class)
	public ResponseEntity<?> invalidCredentialsExceptionHandler(InvalidCredentials ex) {
//		String exceptionMsg = ex.getExceptionmsg();
		return new ResponseEntity<>(ex.getExceptionmsg(),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmployeeNotFound.class)
	public void noemployeeExceptionHandler(EmployeeNotFound ex) {
		String exceptionMsg = ex.getExceptionMobMsg();
		System.out.println(exceptionMsg);
	}
}