package com.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.employee.DAO.EmployeeDAO;
import com.employee.dto.EmployeeDetails;
import com.employee.entity.EmployeeDetailsEntity;
import com.employee.exception.DuplicateEmailException;
import com.employee.exception.DuplicateMobileNumberException;
import com.employee.exception.EmployeeNotFound;
import com.employee.exception.InvalidCredentials;

/*@Service is the combination of @Component annotation
 * It is used to create the bean for service classes and it will tell the class is used to write the 
 * business logic to validate , To create the structure of Response 
 */
@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDAO employeeDAO;
	
	public ResponseEntity<?> employeeRegistration(EmployeeDetails employeeDetails) {
		List<EmployeeDetailsEntity> allEmployeeDetails = employeeDAO.getAllEmployeeDetails();
		
		String email = employeeDetails.getEmail();
		long emailcount = allEmployeeDetails.stream().filter((employee)-> employee.getEmail().equalsIgnoreCase(email)).count();
		if(emailcount >0) {
			throw new DuplicateEmailException("Emailid Already Existed");
		}
		
		long mobilenumbercount = allEmployeeDetails.stream().filter((employee)-> employee.getMobilenumber() == employeeDetails.getMobilenumber()).count();
		if(mobilenumbercount >0) {
			throw new DuplicateMobileNumberException("Mobile Number Already Existed");
		}
		
		
		
		EmployeeDetailsEntity employeeDetailsEntity = new EmployeeDetailsEntity();
		
		employeeDetailsEntity.setEmployeename(employeeDetails.getEmployeename());
		employeeDetailsEntity.setEmail(employeeDetails.getEmail());
		employeeDetailsEntity.setEmployeedeptno(employeeDetails.getEmployeedeptno());
		employeeDetailsEntity.setEmployeesalary(employeeDetails.getEmployeesalary());
		employeeDetailsEntity.setGender(employeeDetails.getGender());
		employeeDetailsEntity.setMobilenumber(employeeDetails.getMobilenumber());
		
		employeeDAO.insertEmployeeDetails(employeeDetailsEntity);
		return new ResponseEntity<>("Registration", HttpStatus.FOUND);
	}
	
	public ResponseEntity<?> employeeLogin(String email, long mobilenumber) {
		EmployeeDetailsEntity employeeDetailsEntity = employeeDAO.getEmployeeDetailsByUsingEmailidAndMobilenumber(email, mobilenumber);
		if(employeeDetailsEntity != null) {
			return new ResponseEntity<>("Login Successfull" , HttpStatus.FOUND);
		}else {
			throw new InvalidCredentials("Invalid Credentials");
		}
	}
	
	public void employeeGet() {
		List<EmployeeDetailsEntity> list = employeeDAO.getAllEmployeeDetails();
		if(list!=null) {
			for(EmployeeDetailsEntity e:list) {
				System.out.println("Name- " +e.getEmployeename());
				System.out.println("Email- "+e.getEmail());
				System.out.println("DeptNo- "+e.getEmployeedeptno());
				System.out.println("Salary- "+e.getEmployeesalary());
				System.out.println("Gender- "+e.getGender());
				System.out.println("MobileNumber- "+e.getMobilenumber());
			}
		}else {
			throw new EmployeeNotFound("No Employee Exist");
		}
	}
	
	public String removeEmployeeByEmail(String email) {
		long res = employeeDAO.deleteEmployeeByEmailid(email);
		if(res>0) {
			return "Employee Deleted";
		}else {
			throw new EmployeeNotFound("No Employee Existed to be Deleted"); 
		}
	}
	
	public String updateSalaryByUsingMobileNumber(double employeesalary, long mobilenumber) {
		long res = employeeDAO.updateEmployeeSalaryByUsingMobileNumber(employeesalary, mobilenumber);
		if(res>0) {
			return "Employee Updated";
		}else {
			throw new EmployeeNotFound("No Employee Existed to be Updated");
		}
	}
	public void getEmployeeById(int id) {
		Optional<EmployeeDetailsEntity> list = employeeDAO.getEmployeeById(id);
		System.out.println(list);
	}

}
