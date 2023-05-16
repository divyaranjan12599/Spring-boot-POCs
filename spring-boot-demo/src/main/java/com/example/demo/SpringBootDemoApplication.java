package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.models.Users;
import com.example.demo.repo.UserRepository;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootDemoApplication implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Users u = new Users();
		u.setEmail("l@g.com");
		u.setPassword("l@1234");
		u.setRole("ADMIN");
		u.setUsername("lucky");
		userRepository.save(u);
		
		Users u1 = new Users();
		u1.setEmail("l1@g.com");
		u1.setPassword("l1@1234");
		u1.setRole("NORMAL");
		u1.setUsername("lucky1");
		userRepository.save(u1);
		
	}
	
//	private void run(String args[]) throws Exception {
//		Users u = new Users();
//		u.setEmail("l@g.com");
//		u.setPassword("l@1234");
//		u.setRole("ADMIN");
//		u.setUsername("lucky");
//		userRepository.save(u);
//		
//	}

}
