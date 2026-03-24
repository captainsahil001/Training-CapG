package com.employee.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class DuplicateMobileNumberException extends RuntimeException{
	private String excpmobnum_mssge;
}
