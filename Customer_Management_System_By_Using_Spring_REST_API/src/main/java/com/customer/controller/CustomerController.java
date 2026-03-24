package com.customer.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.customer.dto.CustomerDetails;

@RestController
public class CustomerController {
	
	@PostMapping("/custreg")
	public String customerRegistration(CustomerDetails customerDetails) {
		return "Customer registered";
	}
	
	@GetMapping("/custlogin")
	public String customerLoginByMobileNumber(@RequestParam("custMobileNo") long custMobileNo) {
		return "Login Success for mobile: " + custMobileNo;
	}
	
	@GetMapping("/getallcustomers")
	public String getAllCustomerDetails() {
		return "All customer details";
	}
	
	@PutMapping("/updateCust")
	public String updateEmailIdByPassword(@RequestParam String password,@RequestParam String newEmail) {
		return "Updated Successfully";
	}
	
	@DeleteMapping("/deletecustomer/{custId}")
	public String deleteCustomerById(@PathVariable("custId") int custId) {
		return "Deleted customer details";
	}
}