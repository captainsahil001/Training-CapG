package com.customer.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerDetails {
	private int custId;
	private String custName;
	private long custMobileNo;
	private String prodName;
	private double price;
	private int quantity;
	private double total;
}