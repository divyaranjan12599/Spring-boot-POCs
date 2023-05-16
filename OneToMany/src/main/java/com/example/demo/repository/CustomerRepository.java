package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.OrderResponseDTO;
import com.example.demo.entities.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

//	@Query("SELECT new com.example.demo.dto.OrderResponse(c.name, p.pname) FROM CUSTOMER c JOIN c.products p")
//	public List<OrderResponseDTO> getJoinInformation();
}
