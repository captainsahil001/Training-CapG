package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import com.employee.entity.EmployeeDetailsEntity;

import jakarta.transaction.Transactional;
import jakarta.websocket.server.PathParam;
                                                                                // here we take the primary key dataype of the table
public interface EmployeeRepository extends JpaRepository<EmployeeDetailsEntity, Integer>{
	
	EmployeeDetailsEntity findByEmailAndMobilenumber(String email, long mobilenumber);
	@Transactional
	long removeByEmail(String email);
	
	@Transactional
	@Modifying
	@Query("update EmployeeDetailsEntity emp set emp.employeesalary=:salary where emp.mobilenumber=:mobilenumber")
	long updateSalaryByUsingMobileNumber(@PathParam("salary") double salary,@PathParam("mobilenumber") long mobilenumber);
	
	
	
	
}
