package com.cg.go.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.go.dto.OrderProductMapDTO;

public interface OrderProductMapDao extends JpaRepository<OrderProductMapDTO, String> {
//defining findByOrderId method 
	 List<OrderProductMapDTO> findByOrderId(String userId);

}