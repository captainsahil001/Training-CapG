package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.dto.EmployeeDetails;
import com.employee.entity.EmployeeDetailsEntity;
/* It is the class level annotation
 * It is combination of @Component annotation
 * It is used to specify the class is used to handle the request and response
 * It is used to create a bean for the controller classes*/
import com.employee.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService service;

	/*
	 * @PostMapping is used to create an apu or end point to handle HTTP POST
	 * request or Insert request
	 */
	@PostMapping("/registration")
	public ResponseEntity<?> employeeRegistration(@RequestBody EmployeeDetails employeeDetails) {
		return service.employeeRegistration(employeeDetails);

	}

	/*
	 * @GetMapping is used to create an api or end point to handle the HTTP GET
	 * request or Select request
	 * 
	 * URL 1) Query String 2) Path Param abc@gmail.com 123 Query String:-
	 * localhost:8080/employee?emailid=abc@gmail.com&password=1234
	 * 
	 * 
	 * 
	 * The data that is sent to a method handling an HTTP GET request can be passed
	 * through the URL in two ways: 1) Query String 2) URL Path (PathParam).
	 * 
	 * If the data is sent through a Query String , it is added after the API or
	 * endpoint using a question mark(?). The data is stored in key-value pairs.
	 * 
	 * Syntax- https://localhost:8080/employeelogin?emailid=abc@gmail.com & password
	 * = 1234 Here: key -> email value -> abc@gmail.com
	 * 
	 * key -> password value -> 1234 To retrieve values from the Query String in
	 * Spring Boot, we use the @RequestParam annotation.
	 * 
	 * @RequestParam is applied to method parameters.
	 */

	@GetMapping("/emplogin")
	public ResponseEntity<?> employeeLoginByUsingEmailAndMobile(@RequestParam("emailid") String emailid,
			@RequestParam("mobilenumber") long mb) {

		return service.employeeLogin(emailid, mb);
	}

	/*
	 * @PutMapping is used to create an api or end point to handle the HTTP PUT
	 * request or Update request
	 */
	@PutMapping("/updatesalary/{salary}/{mobilenumber}")
	public String updateEmployeeSalaryByUsingMobileNumber(@PathVariable("salary") double employeesalary,@PathVariable("mobilenumber") long mobilenumber) {
		return service.updateSalaryByUsingMobileNumber(employeesalary, mobilenumber);
	}

	/*
	 * @DeleteMapping is used to create an api or end point to handle the HTTP
	 * DELETE request or Delete request
	 * 
	 * 
	 * The data that is sent to a method handling an HTTP DELETE request can also be
	 * passed through the URL path itself. This is called a Path Parameter (or Path
	 * Variable). In this case, the value is sent as part of the URL pattern instead
	 * of using a key and value pair or query string.
	 * 
	 * Syntax: https://localhost:8080/deleteemployee/dinga@gmail.com Here: Path
	 * Variable -> dinga@gmail.com
	 * 
	 * To retrieve values from the URL path in Spring Boot, we use the @PathVariable
	 * annotation.
	 * 
	 * @pathVariable is applied to method parameters.
	 * 
	 * @DeleteMapping is used to create an api or end point to handle the HTTP
	 * DELETE request or Delete request
	 */
	@ResponseBody // it is combination of @Controller and @ResponseBody together used to handle
					// req and res and to convert java obj to json
	@DeleteMapping("/deleteemployee/{emailid}")
	public String deleteEmployeeDetailsByUsingEmail(@PathVariable("emailid") String emailid) {

		service.removeEmployeeByEmail(emailid);
		return "Employee Details Deleted";

	}

	@ResponseBody
	@GetMapping("/getallemployees")
	public String getAllEmployeeDetails() {

		service.employeeGet();
		return "All Details of Employee";
	}

	@DeleteMapping("/deleteemployeewithid/{mobilenumber}/{password}")
	public void deleteEmployeeDetailsByUsingMobileNumberPassword(@PathVariable("mobilenumber") long mobilenumber,
			@PathVariable("password") String password) {

	}
	
	@GetMapping("/getemployeebyid/{id}")
    public String getEmployeeById(@PathVariable("id") int id) {
        service.getEmployeeById(id);
        return "Found It";
    }
}