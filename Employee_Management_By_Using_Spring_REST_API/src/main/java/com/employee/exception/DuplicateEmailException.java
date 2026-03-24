package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DuplicateEmailException extends RuntimeException{
	private String excpemailid_mssge;
}
