package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Getter
//@Setter
//@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data


public class EmployeeDetails {
	
//	private int id;
	private String employeename ;
	private double employeesalary;
	private int employeedeptno;
	private long mobilenumber;
	private String email;
	private String gender;
	

}
