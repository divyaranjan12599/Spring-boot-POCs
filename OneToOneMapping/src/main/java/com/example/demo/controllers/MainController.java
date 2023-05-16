package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Address;
import com.example.demo.models.User;
import com.example.demo.services.AddressService;
import com.example.demo.services.UserService;

@RestController
public class MainController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return this.userService.getAllUsers();
	}
	
	@GetMapping("/users/{user_id}")
	public User getUser(@PathVariable("user_id")int user_id){
		return this.userService.getUser(user_id);
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user){
		return this.userService.add(user);
	}
	
	@GetMapping("/addresses")
	public List<Address> getAllAddresss(){
		return this.addressService.getAllAddresses();
	}
	
	@GetMapping("/addresses/{address_id}")
	public Address getAddress(@PathVariable("address_id")int address_id){
		return this.addressService.getAddress(address_id);
	}
	
	@PostMapping("/addresses")
	public Address addAddress(@RequestBody Address address){
		return this.addressService.add(address);
	}

}
