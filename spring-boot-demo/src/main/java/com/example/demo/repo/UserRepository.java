package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, String>{
	
	public Users findByUsername(String username);

}
