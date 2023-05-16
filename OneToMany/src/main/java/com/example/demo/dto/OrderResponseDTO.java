package com.example.demo.dto;

public class OrderResponseDTO {
	private String name;
	private String pname;
	
	public OrderResponseDTO(String name, String pname) {
		super();
		this.name = name;
		this.pname = pname;
	}
	public String getName() {
		return name;
	}
	public OrderResponseDTO() {
		super();
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
}
