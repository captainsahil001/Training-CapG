package com.employee.DAO;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.EmployeeDetailsEntity;
import com.employee.repository.EmployeeRepository;

/* @Repository is combination of @Component annotation
 * It is used to create the bean of the DAO classes and it will tell that DAO 
 * class is used to perform the database operations by depending upon the repository*/
@Repository
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	// In this class we use to Insert, Delete, Update, and Select in the Employee Table.
	
	public void insertEmployeeDetails(EmployeeDetailsEntity employeeDetailsEntity){
		EmployeeDetailsEntity emDetailsEntity = 
		employeeRepository.save(employeeDetailsEntity);
	}
	
	public List<EmployeeDetailsEntity> getAllEmployeeDetails(){
		//select
		return employeeRepository.findAll();
	}
	
	public EmployeeDetailsEntity getEmployeeDetailsByUsingEmailidAndMobilenumber(String emailid, long mobilenumber) {
		//select
		return employeeRepository.findByEmailAndMobilenumber(emailid, mobilenumber);
	}
	
	public long deleteEmployeeByEmailid(String email) {
		
		return employeeRepository.removeByEmail(email);
	}
	
	public long updateEmployeeSalaryByUsingMobileNumber(double salary, long mobilenumber) {
		//update
		return employeeRepository.updateSalaryByUsingMobileNumber(salary, mobilenumber);
	}
	
	public Optional<EmployeeDetailsEntity> getEmployeeById(int id) {
		return employeeRepository.findById(id);
	}
	
}
