package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Users;
import com.example.demo.repo.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserService() {
	}
	
	public List<Users> getAllUserss(){
		return this.userRepository.findAll();
	}
	
	public Users getUsers(String username) {
		return this.userRepository.findByUsername(username);
	}
	
	public Users addUsers(Users user) {
		this.userRepository.save(user);
		return user;
	}
}
