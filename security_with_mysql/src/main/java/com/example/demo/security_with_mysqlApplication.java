package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.demo.model.User;
import com.example.demo.repositories.UserRepo;

@SpringBootApplication
public class security_with_mysqlApplication implements CommandLineRunner{
	
	@Autowired
	private UserRepo userRepository;

	public static void main(String[] args) {
		SpringApplication.run(security_with_mysqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User u = new User();
		u.setPassword("l@1234");
		u.setRole("ADMIN");
		u.setUsername("lucky");
		userRepository.save(u);
		
		User u1 = new User();
		u1.setPassword("l1@1234");
		u1.setRole("NORMAL");
		u1.setUsername("lucky1");
		userRepository.save(u1);
		
	}

}
