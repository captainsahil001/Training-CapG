package com.employee.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity	
public class EmployeeDetailsEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false)
	private String employeename ;
	
	@Column(nullable = false)
	private double employeesalary;
	
	@Column(nullable = false)
	private int employeedeptno;
	
	@Column(nullable = false,unique = true, length =10)
	private long mobilenumber;
	
	@Column(nullable = false,unique = true)
	private String email;
	
	@Column(nullable = false)
	private String gender;
}
