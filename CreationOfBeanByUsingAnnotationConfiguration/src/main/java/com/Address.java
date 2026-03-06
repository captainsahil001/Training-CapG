package com;

import org.springframework.stereotype.Component;

@Component("add")
public class Address {
	
	public Address() {
		System.out.println("Address created");
	}

}
