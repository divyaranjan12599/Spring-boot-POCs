package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Users;
import com.example.demo.services.UserService;

@RestController
@PreAuthorize("hasRole('ADMIN')")
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping({""})
	public List<Users> getAllUsers(){
		return this.userService.getAllUserss();
	}
	
	@GetMapping("/{username}")
	public Users getUser(@PathVariable("username")String username){
		return this.userService.getUsers(username);
	}
	
	@PostMapping("")
	public Users addUser(@RequestBody Users user){
		return this.userService.addUsers(user);
	}

}
