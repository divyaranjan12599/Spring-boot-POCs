package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Address;
import com.example.demo.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;

	public AddressService() {
	}

	public List<Address> getAllAddresses() {
		return this.addressRepository.findAll();
	}

	public Address getAddress(int address_id) {
		return this.addressRepository.findById(address_id).get();
	}

	public Address add(Address address) {
		this.addressRepository.save(address);
		return address;
	}
}
