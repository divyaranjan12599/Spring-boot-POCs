package com.example.demo.dto;

import com.example.demo.entities.Customer;

public class OrderRequestDTO {

	private Customer customer;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
}
