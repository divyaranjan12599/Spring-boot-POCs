package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SqlServerApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SqlServerApplication.class, args);
	}

}
