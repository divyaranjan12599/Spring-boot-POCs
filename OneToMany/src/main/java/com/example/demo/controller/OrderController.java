package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.OrderRequestDTO;
import com.example.demo.entities.Customer;
import com.example.demo.repository.CustomerRepository;
import com.example.demo.repository.ProductRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private ProductRepository productRepository;

//	{
//	    "customer":{
//	        "name":"name1",
//	        "email":"a@b.com",
//	        "gender":"male",
//	        "products":[{
//	            "pid":201,
//	            "pname":"pname1",
//	            "price":1000
//	        },
//	        {
//	            "pid":202,
//	            "pname":"pname2",
//	            "price":2000
//	        }]
//	    }
//	}
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderRequestDTO request) {
		//System.out.println(request.getP1());
		return customerRepository.save(request.getCustomer());
	}
	
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		return customerRepository.findAll();
	}
	
	@PostMapping("/placeOrder2")
	public Customer placeOrder1(@RequestBody Customer c1) {
		System.out.println(c1.getEmail());
		customerRepository.save(c1);
		return c1;
		
	}
	
	
	
}
