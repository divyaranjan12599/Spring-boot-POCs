package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.models.User;
import com.example.demo.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public UserService() {
	}

	public List<User> getAllUsers() {
		return this.userRepository.findAll();
	}

	public User getUser(int user_id) {
		return this.userRepository.findById(user_id).get();
	}

	public User add(User user) {
		this.userRepository.save(user);
		return user;
	}
}
