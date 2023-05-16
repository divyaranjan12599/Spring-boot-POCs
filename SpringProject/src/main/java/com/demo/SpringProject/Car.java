package com.demo.SpringProject;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void drive() {
		System.out.println("Car is Running...");

	}
}
