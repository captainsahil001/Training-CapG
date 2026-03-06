package com;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("emp") // if we dont mention here emp or in any other class having component then it will show class name in camel case
@ComponentScan(basePackages = "com") // this checks for other class containing component and make their beans too if only this class we mention in app , less code.
public class EmployeeDetails {
	
	public void displayEmployeeDetails() {
		
		System.out.println("Employee Name: ABC");
		System.out.println("Employee Salary: 650000");
	}
	
}
